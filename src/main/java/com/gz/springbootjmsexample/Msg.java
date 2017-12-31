package com.gz.springbootjmsexample;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/** 消息定义
 * @author xiaozefeng
 */
public class Msg implements MessageCreator{
    @Override
    public Message createMessage(Session session) throws JMSException {
        return session.createTextMessage("消息测试");
    }
}
