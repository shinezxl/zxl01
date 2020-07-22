package com.tiger.demo.learn.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.tiger.demo.learn.mq.RabbitConfig.QUEUE_ONE;
import static com.tiger.demo.learn.mq.RabbitConfig.QUEUE_TWO;

@Component
public class MqConsumer {
    @RabbitListener(queues=QUEUE_TWO)
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }
    @RabbitListener(queues=QUEUE_TWO)
    @RabbitHandler
    public void process1(String hello) {
        System.out.println("Receiver1  : " + hello);
    }

    @RabbitListener(queues=QUEUE_ONE)
    @RabbitHandler
    public void process2(String hello) {
        System.out.println("Receiver2  : " + hello);
    }
}
