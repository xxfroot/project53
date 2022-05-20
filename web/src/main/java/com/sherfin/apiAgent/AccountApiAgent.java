package com.sherfin.apiAgent;


import com.sherfin.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

@FeignClient("nacos-service")
public interface AccountApiAgent {

    @RequestMapping(method = RequestMethod.POST, value = "/addAccount", consumes = "application/json")
    Result addAccount(HashMap<String,String> map);
}
