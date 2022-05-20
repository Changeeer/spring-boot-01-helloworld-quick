package com.mytest.springboot.dto.demo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class Swagger3User {
    @Schema(name = "用户id")
    private Integer id;

    @Schema(name = "名字", required = true)
    private String name;

    @Schema(name = "手机", required = true)
    private String mobile;

    @Schema(name = "年龄")
    private Integer age;

    @Schema(name = "性别")
    private Integer sex;

    @Schema(name = "朋友")
    private List<Swagger3User> friends;

    @Schema(hidden = true)
    private Integer status;
}
