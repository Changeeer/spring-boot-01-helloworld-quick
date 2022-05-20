package com.mytest.springboot.dto;

import lombok.Data;

import java.util.List;

@Data
public class NormalVO {

    /**
     * name
     * @eo.required
     */
    private String name;

    /**
     * 性别
     * @eo.required
     */
    private int sex;

    /**
     * mobile
     * @eo.required
     */
    private String mobile;

    /**
     * addrs
     * @eo.required
     */
    private List<String> addrs;
}
