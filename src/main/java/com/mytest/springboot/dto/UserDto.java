package com.mytest.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    /**
     * 用户名
     */
    @NotNull(message = "name can not be null")
    private String userName;
    /**
     * 年龄
     */
    @Min(value = 18, message = "must > 18 years old")
    private Integer ages;
    /**
     * 朋友
     */
    private List<UserDto> friends;
//    private List<? extends UserDto> friends;
    /**
     * 昵称
     */
    private List<String> nickNames;
    /**
     * 电话
     * @eo.required
     */
    private String[] mobile;
    /**
     * 关系图
     */
    private Map<String, UserDto> maps;
//    private Class<? extends Exception> e;

    /**
     * 父类
     */
    private UserDto father;

    private List<Address> addressList;

}