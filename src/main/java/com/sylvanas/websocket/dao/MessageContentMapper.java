package com.sylvanas.websocket.dao;

import com.sylvanas.websocket.pojo.MessageContent;
import com.sylvanas.websocket.pojo.MessageContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageContentMapper {
    int countByExample(MessageContentExample example);

    int deleteByExample(MessageContentExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(MessageContent record);

    int insertSelective(MessageContent record);

    List<MessageContent> selectByExample(MessageContentExample example);

    List<MessageContent> findAll();

    MessageContent selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") MessageContent record, @Param("example") MessageContentExample example);

    int updateByExample(@Param("record") MessageContent record, @Param("example") MessageContentExample example);

    int updateByPrimaryKeySelective(MessageContent record);

    int updateByPrimaryKey(MessageContent record);
}