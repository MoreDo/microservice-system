package com.moredo.examples.stream1.rabbit.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ProductProcessor {

    String OUTPUT_PRODUCT_ADD = "outputProductAdd";

    @Output(OUTPUT_PRODUCT_ADD)
    MessageChannel outputProductAdd();

}