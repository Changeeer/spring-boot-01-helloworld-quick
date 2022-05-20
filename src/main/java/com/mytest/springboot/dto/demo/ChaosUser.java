package com.mytest.springboot.dto.demo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class ChaosUser {
    /**
     * 用户id
     */
    private Integer id;

    @Schema(name = "名字", required = true)
    private String name;

    @ApiModelProperty(value = "手机", required = true)
    private String mobile;

    @ApiModelProperty("年龄")
    private Integer age;

    @Schema(name = "性别")
    private Integer sex;
    /**
     * 朋友
     */
    private List<ChaosUser> friends;
    /**
     * @eo.hidden
     */
    private Integer status;
}
