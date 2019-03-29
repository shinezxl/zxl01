package com.tiger.demo.learn.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MqProduct {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("zxl1", context);
    }

    public void sendMany() {
        for (int i = 0; i < 1000; i++) {
            String context = "hello " + i;
            this.rabbitTemplate.convertAndSend("zxl2", context);
        }
    }




}
