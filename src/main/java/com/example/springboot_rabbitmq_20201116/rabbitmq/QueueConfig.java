//package com.example.springboot_rabbitmq_20201116.rabbitmq;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.FanoutExchange;
//import org.springframework.amqp.core.Queue;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class QueueConfig {
//
//    @Bean(name = "wf_queue")
//    public Queue confirmTestQueue() {
//        return new Queue("wf_queue", true, false, false);
//    }
//
//    @Bean(name = "wfTestExchange")
//    public FanoutExchange confirmTestExchange() {
//        return new FanoutExchange("wfTestExchange");
//    }
//
//    @Bean
//    public Binding confirmTestFanoutExchangeAndQueue(
//            @Qualifier("wfTestExchange") FanoutExchange confirmTestExchange,
//            @Qualifier("wf_queue") Queue confirmTestQueue) {
//        return BindingBuilder.bind(confirmTestQueue).to(confirmTestExchange);
//    }
//}