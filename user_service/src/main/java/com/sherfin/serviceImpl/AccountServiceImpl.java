package com.sherfin.serviceImpl;


import com.sherfin.mapper.AccountMapper;
import com.sherfin.mapperBean.Account;
import com.sherfin.service.AccountService;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;


    @Override
    public Account selectUseByPhone(String phoneNumber) {
        Account account = new Account();
        account.setMobile(phoneNumber);
       return accountMapper.selectOne(account);

    }

    @Override
    public Integer addUser(Account account) {
        return  accountMapper.insert(account);
    }

}
