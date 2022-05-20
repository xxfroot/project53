package com.sherfin.service;


import com.sherfin.mapperBean.Account;

public interface AccountService {

    Account selectUseByPhone(String phoneNumber);

    Integer addUser(Account user);

}
