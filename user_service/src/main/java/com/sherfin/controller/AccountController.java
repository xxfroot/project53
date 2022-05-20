package com.sherfin.controller;



import com.sherfin.mapperBean.Account;
import com.sherfin.serviceImpl.AccountServiceImpl;
import com.sherfin.utils.Result;
import com.sherfin.utils.VetificationCodeUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;

    private static final Logger log = LoggerFactory.getLogger(AccountController.class);

    @ResponseBody
    @GetMapping("/mobiles/{mobile}/key/codeKey/code/{vetificationCode}")
    public Result registerOrLogin(@PathVariable String mobile ,@PathVariable String vetificationCode){
        log.info("用户校验验证码---------手机号："+mobile+"----验证码："+vetificationCode);
        if(mobile.isEmpty()){
            return new Result(null,"请填写正确的手机号",500);
        }
        //校验验证码
       if (VetificationCodeUntil.checkVetificationCode(mobile,vetificationCode)){
           log.info("用户校验验证码---------手机号："+mobile+"----验证码校验正确。");
           //查找用户是否存在
             Account selectedUser = accountService.selectUseByPhone(mobile);
           if (selectedUser==null){
               log.info("用户手机号："+mobile+"----还未注册。");
               return new Result(0,"请求成功",0);
           }else {
               log.info("用户手机号："+mobile+"----登录。");
               return new Result(1,"请求成功",0);
           }
       }
        log.info("用户校验验证码---------手机号："+mobile+"----验证码校验错误。");
        return new Result(null,"验证码不正确",200);
    }


    //获得验证码
    @GetMapping ("/sms/{mobile}")
    public Result getVetificationCode(@PathVariable String mobile){
        log.info("------------------传入手机号:"+mobile);
        String vetificationCode = VetificationCodeUntil.createVetificationCode(mobile);
        log.info("------------------获得验证码:"+vetificationCode);
        //返回验证码
        return new Result(vetificationCode,"success",0);
    }

    @PostMapping("/addAccount")
     public Result addAccount(@RequestBody HashMap<String,String> map){
        log.info("添加账户-------------");
        return null;
    }


}
