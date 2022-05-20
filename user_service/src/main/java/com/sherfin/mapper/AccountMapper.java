package com.sherfin.mapper;

import com.sherfin.mapperBean.Account;
import com.sherfin.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AccountMapper extends MyMapper<Account> {
}