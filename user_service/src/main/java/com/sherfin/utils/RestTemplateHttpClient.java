package com.sherfin.utils;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateHttpClient {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder ) {
        return builder
                //.basicAuthentication("username", "password")
                // .setConnectTimeout(Duration.ofSeconds(3))
                // .setReadTimeout(Duration.ofSeconds(5))
                .build();
    }

}
