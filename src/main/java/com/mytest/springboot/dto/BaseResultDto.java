package com.mytest.springboot.dto;

import lombok.Data;

@Data
public class BaseResultDto {

    private String requestId;

    private Long createTime;
}
