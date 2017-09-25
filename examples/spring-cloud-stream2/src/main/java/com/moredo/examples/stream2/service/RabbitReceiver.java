package com.moredo.examples.stream2.service;

import com.moredo.common.rabbitmq.TestMessage;
import com.moredo.examples.stream2.rabbit.consumer.ProductConsumer;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class RabbitReceiver {

    @StreamListener(ProductConsumer.INPUT_PRODUCT_ADD)
    public void inputProductAdd(Message<TestMessage> message) {
        System.out.println("新增产品监听收到：begin");
        System.out.println("type：" + message.getPayload().getType());
        System.out.println("content：" + message.getPayload().getMessage());
        System.out.println("新增产品监听收到：end");
    }

}