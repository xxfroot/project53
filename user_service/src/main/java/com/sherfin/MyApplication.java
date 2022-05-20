package com.sherfin;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.sherfin.mapper")
public class MyApplication {


    public static void main(String[] args) {
            SpringApplication.run(MyApplication.class,args);
    }
}
