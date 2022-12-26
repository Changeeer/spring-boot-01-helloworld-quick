package com.mytest.springboot.dto.demo;

import lombok.Data;

import java.util.List;

@Data
public class EolinkUser {

    /**
     * id
     * @eo.remark
     */
    private Integer id;

    /**
     * name
     * @eo.remark
     */
    private String name;

    /**
     * mobile
     * @eo.remark
     */
    private String mobile;

    /**
     * age
     * @eo.remark
     */
    private Integer age;

    /**
     * sex
     * @eo.remark
     */
    private Integer sex;

    /**
     * friends
     * @eo.remark
     */
    private List<EolinkUser> friends;

    /**
     * status
     * @eo.remark
     */
    private Integer status;
}
