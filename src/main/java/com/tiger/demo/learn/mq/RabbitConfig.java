package com.tiger.demo.learn.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String QUEUE_ONE = "queue01";
    public static final String QUEUE_TWO = "queue02";

    /**
     * MQ
     * @return
     */
    @Bean
    public Queue zxl1Queue() {
        return new Queue(QUEUE_ONE);
    }

    @Bean
    public Queue zxl2Queue() {
        return new Queue(QUEUE_TWO);
    }




}
