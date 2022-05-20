package com.sherfin.utils;

import java.util.UUID;

public class UserUtil {

    public static String getRandomName(){
        return "用户:"+ UUID.randomUUID().toString();
    }


}
