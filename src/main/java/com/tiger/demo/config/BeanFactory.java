package com.tiger.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {

    /**
     * MQ
     * @return
     */
    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }
}
