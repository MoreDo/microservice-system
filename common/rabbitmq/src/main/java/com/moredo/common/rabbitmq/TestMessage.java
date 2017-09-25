package com.moredo.common.rabbitmq;

/**
 * @Author 肖红星
 * @Date 2017/9/25 15:06
 */
public class TestMessage {

    private int type;
    private String message;

    public TestMessage(int type, String message) {
        this.type = type;
        this.message = message;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
