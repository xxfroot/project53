package com.sherfin.serviceImpl;

import com.sherfin.mapper.ConsumerMapper;
import com.sherfin.mapperBean.Consumer;
import com.sherfin.service.ConsumerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ConsumerServiceImpl implements ConsumerService {


    @Resource
    private ConsumerMapper consumerMapper;


    @Override
    public int addConsumer(Consumer consumer) {
        return consumerMapper.insert(consumer);
    }
}
