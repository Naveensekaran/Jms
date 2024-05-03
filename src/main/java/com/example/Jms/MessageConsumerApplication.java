package com.example.Jms;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.Jms.spring.config.AppConfig;
import com.example.Jms.spring.receiver.MessageReceiver;

public class MessageConsumerApplication {
     public static void main(String[] args){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
        String response = messageReceiver.receiveMessage();
        System.out.println("Message Received :"+ response);

        ((AbstractApplicationContext) context).close();
    }
}
