package org.hongxi.whatsmars.mq.rocketmq.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring/rocketmq-consumer.xml");
    }
}
