package com.example.Jms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.Jms.spring.config.AppConfig;
import com.example.Jms.spring.sender.MessageSender;

public class MessageProducerApplication {
    
    public static void main(String[] args){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = context.getBean(MessageSender.class);

        messageSender.sendMessage("Hi Naveen, How are you...?");
        System.out.println("Message has been sent Successfully");

        ((AbstractApplicationContext) context).close();
    }

}
