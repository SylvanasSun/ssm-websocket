package com.sylvanas.websocket.service.impl;

import com.sylvanas.websocket.dao.MessageContentMapper;
import com.sylvanas.websocket.pojo.MessageContent;
import com.sylvanas.websocket.service.MessageContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SylvanasSun on 2017/2/16.
 */
@Service("messageContentService")
public class MessageContentServiceImpl implements MessageContentService {

    @Autowired
    private MessageContentMapper messageContentMapper;

    @Override
    public int create(MessageContent mc) {
        return messageContentMapper.insert(mc);
    }

    @Override
    public int createSelective(MessageContent mc) {
        return messageContentMapper.insertSelective(mc);
    }

    @Override
    public int deleteById(Integer mid) {
        return messageContentMapper.deleteByPrimaryKey(mid);
    }

    @Override
    public int update(MessageContent mc) {
        return messageContentMapper.updateByPrimaryKeySelective(mc);
    }

    @Override
    public List<MessageContent> findAll() {
        return messageContentMapper.findAll();
    }

    @Override
    public MessageContent findById(Integer mid) {
        return messageContentMapper.selectByPrimaryKey(mid);
    }
}
