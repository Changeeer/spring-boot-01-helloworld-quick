package com.mytest.springboot.dto;

import lombok.Data;

@Data
public class BaseRequest<T> {

    private T data;

    private String flag;
}
