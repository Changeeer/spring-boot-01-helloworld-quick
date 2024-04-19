package com.mytest.springboot.common;

import lombok.Data;

@Data
public class RequestParams<T> {
    /**
     * 123123123
     */
    private T data;

    private String requestId;

    public RequestParams() {
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

}

