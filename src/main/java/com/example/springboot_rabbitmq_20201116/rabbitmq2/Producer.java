package com.example.springboot_rabbitmq_20201116.rabbitmq2;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生产者
 * @author milicool
 * Created on 2018/9/14
 */
@Component
public class Producer {
 
    @Autowired
    private RabbitTemplate rabbitTemplate;
 
    /**
     * 给hello队列发送消息
     */
    public void send() {
        for (int i =0; i< 30; i++) {
            String msg = "hello, 序号: " + i;
            System.out.println("Producer生产消息, " + msg);
            rabbitTemplate.convertAndSend("queue-test", msg);
        }
    }
 
}