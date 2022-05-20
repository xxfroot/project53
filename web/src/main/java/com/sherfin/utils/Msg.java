package com.sherfin.utils;

public enum Msg {

    SUCCESS("成功"),FAILD("失败");

    private String msg;

    Msg (String msg){
        this.msg= msg;
    }

    public String getMsg() {
        return msg;
    }
}
