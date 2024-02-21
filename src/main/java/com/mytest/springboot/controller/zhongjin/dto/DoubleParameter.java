package com.mytest.springboot.controller.zhongjin.dto;

import lombok.Data;

@Data
public class DoubleParameter<DTO, PageQuery> {

    private DTO dto;

    private PageQuery pageQuery;
}
