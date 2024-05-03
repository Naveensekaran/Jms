package com.example.Jms.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.example.Jms")
@Import({MessagingConfiguration.class})
public class AppConfig {
    
}
