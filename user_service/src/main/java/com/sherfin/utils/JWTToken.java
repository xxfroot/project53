package com.sherfin.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.sherfin.mapperBean.Account;

import java.util.HashMap;
import java.util.Map;

public class JWTToken {


    /**
     * 生成JWTTOKEN
     * @param user
     * @return token
     */
    public static String JWTCreator(Account user){
        String token=null;
        Map<String,Object>  payLoadMap = new HashMap<>();
        payLoadMap.put("fullName",user.getUsername());
        payLoadMap.put("mobile",user.getMobile());
        try {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            token = JWT.create()
                    .withIssuer("auth0")
                    .withKeyId(user.getId().toString())
                    .withPayload(payLoadMap)
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            return Msg.FAILD.getMsg();
        }
        return token;
    }

    /**
     * token校验
     * @param token
     * @return MSG
     */
     public String jwtVerifier(String token){
        String keyId = null;
         try {
             Algorithm algorithm = Algorithm.HMAC256("secret"); //use more secure key
             JWTVerifier verifier = JWT.require(algorithm)
                     .withIssuer("auth0")
                     .build(); //Reusable verifier instance
             DecodedJWT jwt = verifier.verify(token);
         } catch (JWTVerificationException exception){
             return Msg.FAILD.getMsg();
         }
         return Msg.SUCCESS.getMsg();
     }


}
