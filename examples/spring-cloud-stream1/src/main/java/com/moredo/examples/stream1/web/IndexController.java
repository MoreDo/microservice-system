package com.moredo.examples.stream1.web;

import com.moredo.examples.stream1.service.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class IndexController {

    @Autowired
    private RabbitSender rabbitSender;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        rabbitSender.sendMessage("I'm Stream Client 1");
        return "消息发送成功！";
    }

}
