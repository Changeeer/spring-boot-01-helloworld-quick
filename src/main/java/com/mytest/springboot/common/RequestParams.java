package com.mytest.springboot.common;

public class RequestParams<T> {
    /**
     * 123123123
     */
    private T data;

    public RequestParams() {
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

