package com.example.Jms.spring.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
@Component
public class MessageSender {

    @Autowired
    JmsTemplate jmsTemplate;
    
    public void sendMessage(final String message){
        jmsTemplate.send(new MessageCreator()
        {
            public Message createMessage(Session session) throws JMSException{
                ObjectMessage objectMessage = (ObjectMessage) session.createObjectMessage(message);
                return (Message) objectMessage;
            }
        });
    }
}
