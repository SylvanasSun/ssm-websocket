package com.sylvanas.websocket.service;

import com.sylvanas.websocket.pojo.MessageContent;

import java.util.List;

/**
 * Created by SylvanasSun on 2017/2/16.
 */
public interface MessageContentService {
    int create(MessageContent mc);

    int createSelective(MessageContent mc);

    int deleteById(Integer mid);

    int update(MessageContent mc);

    List<MessageContent> findAll();

    MessageContent findById(Integer mid);
}
