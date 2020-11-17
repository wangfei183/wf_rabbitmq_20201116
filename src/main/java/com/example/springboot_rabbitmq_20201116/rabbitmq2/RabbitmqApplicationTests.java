package com.example.springboot_rabbitmq_20201116.rabbitmq2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RabbitmqApplicationTests {
 
//    @Autowired
//    private Producer producer;
//
//    @Test
//    public void contextLoads() {
//        producer.send();
//    }


    @Autowired
    private Producer producer;

    @RequestMapping("sendmq")
    @ResponseBody
    public void contextLoads() {
        producer.send();
    }
 
}