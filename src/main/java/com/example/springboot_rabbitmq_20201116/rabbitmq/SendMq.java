//package com.example.springboot_rabbitmq_20201116.rabbitmq;
//
//import org.springframework.amqp.core.MessageDeliveryMode;
//import org.springframework.amqp.rabbit.connection.CorrelationData;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.UUID;
//
///**
// * Created with IntelliJ IDEA.
// *
// * @Auther: 王飞
// * @Date: 2020/11/17/11:41
// * @Description:
// */
//public class SendMq {
//
//
//
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    @Autowired
//    private ConfirmCallbackService confirmCallbackService;
//
//    @Autowired
//    private ReturnCallbackService returnCallbackService;
//
//    public void sendMessage(String exchange, String routingKey, Object msg){
//
//        /**
//         * 确保消息发送失败后可以重新返回到队列中
//         * 注意：yml需要配置 publisher-returns: true
//         */
//        rabbitTemplate.setMandatory(true);
//
//        /**
//         * 消费者确认收到消息后，手动ack回执回调处理
//         */
//        rabbitTemplate.setConfirmCallback(confirmCallbackService);
//
//        /**
//         * 消息投递到队列失败回调处理
//         */
//        rabbitTemplate.setReturnCallback(returnCallbackService);
//
//        /**
//         * 发送消息
//         */
//        rabbitTemplate.convertAndSend(exchange,routingKey,msg,
//                message->{
//                    message.getMessageProperties().setDeliveryMode(MessageDeliveryMode.PERSISTENT);
//                    return message;
//                },
//                new CorrelationData(UUID.randomUUID().toString()));
//    }
//}
