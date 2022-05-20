package com.mytest.springboot.common;

public class ResponseParams<T> {
    /**
     * 状态码
     * @eo.required
     */
    private String code;
    /**
     * 返回信息
     * @eo.required
     */
    private String msg;
    /**
     * 返回对象
     */
    private T data;

    public ResponseParams() {
    }

    public ResponseParams(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseParams(T t) {
        this.data = t;
        this.code = "000";
        this.msg = "success";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

