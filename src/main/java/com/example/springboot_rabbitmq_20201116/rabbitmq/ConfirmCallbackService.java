//package com.example.springboot_rabbitmq_20201116.rabbitmq;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.amqp.rabbit.connection.CorrelationData;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//
//
//@Component
//public class ConfirmCallbackService implements RabbitTemplate.ConfirmCallback {
//
//    private static Logger log= LoggerFactory.getLogger(ConfirmCallbackService.class);
//    @Override
//    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
//
//        if (!ack) {
//            log.error("消息发送异常!");
//        } else {
//            log.info("发送者爸爸已经收到确认，correlationData={} ,ack={}, cause={}", correlationData.getId(), ack, cause);
//        }
//    }
//}
//
