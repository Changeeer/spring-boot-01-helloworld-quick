package com.mytest.springboot.dto;

import lombok.Data;

@Data
public class PageQuery {

    private int page;
    private int pageSize;
}
