package com.mytest.springboot.dto.demo;

import lombok.Data;

import java.util.List;

@Data
public class EolinkUser {

    /**
     * id
     * @remark
     */
    private Integer id;

    /**
     * name
     * @remark
     */
    private String name;

    /**
     * mobile
     * @remark
     */
    private String mobile;

    /**
     * age
     * @remark
     */
    private Integer age;

    /**
     * sex
     * @remark
     */
    private Integer sex;

    /**
     * friends
     * @remark
     */
    private List<EolinkUser> friends;

    /**
     * status
     * @remark
     */
    private Integer status;
}
