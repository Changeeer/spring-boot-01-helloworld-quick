package com.mytest.springboot.dto.demo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class Swagger2User {
    @ApiModelProperty("用户id")
    private Integer id;

    @ApiModelProperty(value = "名字", required = true)
    private String name;

    @ApiModelProperty(value = "手机", required = true)
    private String mobile;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("性别")
    private Integer sex;

    @ApiModelProperty("朋友")
    private List<Swagger2User> friends;

    @ApiModelProperty(hidden = true)
    private Integer status;
}
