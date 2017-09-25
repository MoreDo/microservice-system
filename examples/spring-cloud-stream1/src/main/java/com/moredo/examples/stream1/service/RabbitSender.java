package com.moredo.examples.stream1.service;

import com.moredo.common.rabbitmq.TestMessage;
import com.moredo.examples.stream1.rabbit.producer.ProductProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class RabbitSender {

    @Autowired
    private ProductProcessor productProcessor;

    // 发送消息
    public void sendMessage(String content) {
        TestMessage message = new TestMessage(1, content);
        productProcessor.outputProductAdd().send(MessageBuilder.withPayload(message).build());
    }

}