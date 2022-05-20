package com.mytest.springboot.dto.demo;

import lombok.Data;

import java.util.List;

@Data
public class EolinkUser {
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 名字
     * @eo.required
     */
    private String name;
    /**
     * 手机
     * @eo.required
     */
    private String mobile;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 朋友
     */
    private List<EolinkUser> friends;
    /**
     * @eo.hidden
     */
    private Integer status;
}
