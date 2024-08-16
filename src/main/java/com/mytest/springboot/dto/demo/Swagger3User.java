package com.mytest.springboot.dto.demo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class Swagger3User {
    @Schema(name = "ID", description = "int转long", type = "long")
    private Integer id;

    @Schema(name = "NAME", required = true, description = "名字")
    private String name;

    @Schema(name = "MOBILE", required = true, description = "手机")
    private String mobile;

    @Schema(name = "AGE",description = "年龄", example = "", type = "float")
    private Integer age;

    @Schema(name = "SEX", description = "性别", example = "1=男，2=女")
    private Integer sex;

    @Schema(name = "FRIEND")
    private List<Swagger3User> friends;

    @Schema(hidden = true)
    private Integer status;
}
