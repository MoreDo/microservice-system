package com.moredo.examples.stream2.rabbit.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ProductConsumer {

    String INPUT_PRODUCT_ADD = "inputProductAdd";

    @Input(INPUT_PRODUCT_ADD)
    SubscribableChannel inputProductAdd();

}