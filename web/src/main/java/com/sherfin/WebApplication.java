package com.sherfin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.logging.Logger;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(value = "com.sherfin.mapper")
public class WebApplication {


    public static void main(String[] args) {
        try {
            SpringApplication.run(WebApplication.class,args);
        }catch (Exception e){
            e.getStackTrace();
        }

    }

}
