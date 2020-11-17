package com.example.springboot_rabbitmq_20201116.rabbitmq2;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 消费者
 * @author milicool
 * Created on 2018/9/14
 */
@Component
public class Comsumer {
    private Logger log = LoggerFactory.getLogger(Comsumer.class);

    @RabbitListener(queues = "queue-test")
    public void process(Message message, Channel channel) throws IOException {
        // 采用手动应答模式, 手动确认应答更为安全稳定
        System.out.println();
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
//        channel.basicNack(message.getMessageProperties().getDeliveryTag(),false);
//        channel.basicReject(message.getMessageProperties().getDeliveryTag(),false);

        log.info("receive消费: " + new String(message.getBody()));
    }
}