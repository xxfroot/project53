package com.sherfin.controller;

import com.sherfin.apiAgent.AccountApiAgent;
import com.sherfin.mapperBean.Consumer;
import com.sherfin.serviceImpl.ConsumerServiceImpl;
import com.sherfin.utils.Msg;
import com.sherfin.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.UUID;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {


    @Autowired
    private ConsumerServiceImpl consumerService;

    @Autowired
    private AccountApiAgent accountApiAgent;
      private static final Logger log = LoggerFactory.getLogger(ConsumerController.class);

    /**
     * 客户注册
     * @param map
     * @return
     */
    @PostMapping("/consumers")
    public Result regUser(@RequestBody HashMap<String,String> map){
        log.info("-------------------注册请求"+map.get("username").toString());
        Consumer consumer = new Consumer();
        consumer.setFullname(map.get("username").toString());
        consumer.setMobile(map.get("mobile").toString());
        consumer.setUserNo(UUID.randomUUID().toString());
        consumer.setRole(map.get("role").toString());
        consumer.setIsBindCard(false);
        consumer.setStatus(true);
        consumer.setUserType("1");
        Integer consumerCount = consumerService.addConsumer(consumer);
        Result result = accountApiAgent.addAccount(map);
        return new  Result(consumerCount, Msg.SUCCESS.getMsg(),0);
    }
}
