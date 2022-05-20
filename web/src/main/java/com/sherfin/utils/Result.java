package com.sherfin.utils;

public class Result {

    private Object result;

    private String msg;

    private int code;

    private String access_token;

    public Result(Object data, String msg, int code) {
        this.result = data;
        this.msg = msg;
        this.code = code;
    }

    public Result(String msg, int code, String access_token) {
        this.msg = msg;
        this.code = code;
        this.access_token = access_token;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
