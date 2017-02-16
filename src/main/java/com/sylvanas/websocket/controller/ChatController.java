package com.sylvanas.websocket.controller;

import com.sylvanas.websocket.pojo.MessageContent;
import com.sylvanas.websocket.service.MessageContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.server.standard.SpringConfigurator;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ChatController.
 * <p>
 * 注解@ServerEndpoint类似于@Controller:
 * value指定了一个URI，客户端可以通过这个URI来连接到WebSocket.
 * configurator = SpringConfigurator.class是为了使该类可以通过Spring注入.
 * <p>
 * Created by SylvanasSun on 2017/2/16.
 */
@ServerEndpoint(value = "/chat", configurator = SpringConfigurator.class)
public class ChatController {

    //用于记录当前在线连接数
    private static AtomicInteger onlineCount = new AtomicInteger(0);

    @Autowired
    private MessageContentService messageContentService;

    /**
     * 一个线程安全的Set,用于存放每个客户端对应的ChatController对象.
     */
    private static CopyOnWriteArraySet<ChatController> chatSet = new CopyOnWriteArraySet<>();

    //连接会话,它可以向客户端发送数据
    private Session session;

    public ChatController() {
    }

    /**
     * 开启连接响应事件.
     *
     * @param session 会话对象,即与客户端连接的对象,可以用它发送消息给客户端
     */
    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        onlineCount.incrementAndGet(); //在线连接数++
        chatSet.add(this); //将当前chat对象放入集合
        System.out.println("[CHAT CONNECTION OPEN] 发现新连接,当前在线人数为: " + onlineCount.get());
    }

    /**
     * 响应异常事件
     *
     * @param error 异常对象
     */
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("[CHAT ERROR]");
        error.printStackTrace();
    }

    /**
     * 关闭连接事件
     */
    @OnClose
    public void onClose() {
        onlineCount.decrementAndGet(); //在线连接数--
        chatSet.remove(this); //将当前chat对象移出集合
        System.out.println("[CHAT CONNECTION CLOSE] 发现连接断开,当前在线人数为: " + onlineCount.get());
    }

    /**
     * 响应消息事件
     *
     * @param message 客户端发送的消息
     * @param session 会话对象
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("[CHAT MESSAGE] 接收到客户端发送消息: " + message);
        //对集合中的chat对象进行广播
        if (!chatSet.isEmpty()) {
            for (ChatController chat : chatSet) {
                try {
                    chat.sendMessage(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 发送消息
     */
    private void sendMessage(String message) throws IOException {
        //将消息持久化到数据库
        MessageContent messageContent = new MessageContent();
        messageContent.setmContent(message);
        messageContent.setmName("chat-message");
        Date nowDate = new Date();
        messageContent.setmCreatedtime(nowDate);
        messageContent.setmUpdatedtime(nowDate);
        messageContentService.createSelective(messageContent);
        //发送消息到客户端
        this.session.getBasicRemote().sendText(message);
    }

}
