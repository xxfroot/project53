package com.sherfin.controller;

import com.sherfin.mapperBean.Account;
import com.sherfin.serviceImpl.AccountServiceImpl;
import com.sherfin.utils.JWTToken;
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
import java.util.Map;


@RestController
@RequestMapping("/checkToken")
public class ChecktokenController {

    @Autowired
    private AccountServiceImpl accountService;

    private static final Logger log = LoggerFactory.getLogger(ChecktokenController.class);


    /**
     * 登录校验获取token
     * @param data
     * @return
     */
    @PostMapping("/token")
    public Result oauthToken(@RequestBody Map<String,String> data){
        log.info(data.get("mobile").toString());
        String mobile  = data.get("mobile");
        Account useByPhone = accountService.selectUseByPhone(mobile);
        String jwtToken = JWTToken.JWTCreator(useByPhone);
        log.info("------------手机号:"+useByPhone.getMobile()+"请求登录获取token:"+jwtToken);
        return new Result( Msg.SUCCESS.getMsg(), 0,jwtToken);
    }

}
