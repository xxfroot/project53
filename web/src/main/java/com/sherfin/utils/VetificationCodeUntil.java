package com.sherfin.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class VetificationCodeUntil {

    private static Map<String,String> userVetificationCodeMap;

    private static Random random;

    static {
        userVetificationCodeMap = new HashMap<>();

    }

    /**
     * 创建验证码
     * @param mobile
     * @return
     */
    public  synchronized static String  createVetificationCode(String mobile){
        String vetificationCode = productVetificationCode();
        if(checkUserVetificationCodeMap(mobile)){
            userVetificationCodeMap.remove(mobile);
        }
        userVetificationCodeMap.put(mobile,vetificationCode);
        return userVetificationCodeMap.get(mobile);
    }

    /**
     * 检查验证码
     * @param mobile
     * @param vetificationCode
     * @return
     */
    public synchronized static boolean checkVetificationCode(String mobile,String vetificationCode){
        if (userVetificationCodeMap.get(mobile).equals(vetificationCode)){
            return true;
        }
        return false;
    }

    /**
     * 生成验证码
     * @return
     */
    private  static String  productVetificationCode(){
        if (random==null){
            random = new Random();
        }
        Integer a = random.nextInt(10);
        Integer b = random.nextInt(10);
        Integer c = random.nextInt(10);
        Integer d = random.nextInt(10);
        Integer e = random.nextInt(10);
        Integer f = random.nextInt(10);
        return  a.toString()+b.toString()+c.toString()+d.toString()+e.toString()+f.toString();
    }

    private  static   boolean checkUserVetificationCodeMap(String mobile){
        return userVetificationCodeMap.containsKey(mobile);
    }




}
