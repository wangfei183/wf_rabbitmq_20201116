//package com.example.springboot_rabbitmq_20201116.rabbitmq;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ReturnCallbackService implements RabbitTemplate.ReturnCallback {
//    private static Logger log= LoggerFactory.getLogger(ReturnCallbackService.class);
//    @Override
//    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
//        log.info("returnedMessage ===> replyCode={} ,replyText={} ,exchange={} ,routingKey={}", replyCode, replyText, exchange, routingKey);
//    }
//}