//package com.example.springboot_rabbitmq_20201116.rabbitmq;
//
//
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//import javax.annotation.Resource;
//
///**
// * rabbitMq 配置类
// * @author milicool
// * Created on 2018/9/14
// */
//@Configuration
//public class RabbitConfig {
//    @Resource
//    private RabbitTemplate rabbitTemplate;
//
//    /**
//     * 定义一个hello的队列
//     * Queue 可以有4个参数
//     *      1.队列名
//     *      2.durable       持久化消息队列 ,rabbitmq重启的时候不需要创建新的队列 默认true
//     *      3.auto-delete   表示消息队列没有在使用时将被自动删除 默认是false
//     *      4.exclusive     表示该消息队列是否只在当前connection生效,默认是false
//     */
//    @Bean
//    public Queue helloQueue() {
//        return new Queue("queue-test");
//    }
//
//    /** ======================== 定制一些处理策略 =============================*/
//
//    /**
//     * 定制化amqp模版
//     *
//     * ConfirmCallback接口用于实现消息发送到RabbitMQ交换器后接收ack回调   即消息发送到exchange  ack
//     * ReturnCallback接口用于实现消息发送到RabbitMQ 交换器，但无相应队列与交换器绑定时的回调  即消息发送不到任何一个队列中  ack
//     */
//    @Bean
//    public RabbitTemplate rabbitTemplate() {
//        Logger log = LoggerFactory.getLogger(RabbitTemplate.class);
//
//        // 消息发送失败返回到队列中, yml需要配置 publisher-returns: true
//        rabbitTemplate.setMandatory(true);
//
//        // 消息返回, yml需要配置 publisher-returns: true
////        rabbitTemplate.setReturnCallback();
//     rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
//      @Override
//      public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
////       logger.info("消息丢失:exchange({}),route({}),replyCode({}),replyText({}),message:{}", exchange, routingKey, replyCode, replyText, message);
//      }
//     });
//        // 消息确认, yml需要配置 publisher-confirms: true
//        rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
//            if (ack) {
//                // log.debug("消息发送到exchange成功,id: {}", correlationData.getId());
//            } else {
//                log.debug("消息发送到exchange失败,原因: {}", cause);
//            }
//        });
//
//        return rabbitTemplate;
//    }
//}
