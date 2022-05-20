package com.mytest.springboot.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Data
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
    private List<? extends UserDto> friends;
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
     * 状态
     * @eo.hidden
     */
    private int status;

    /**
     * 地址1
     * @eo.required
     */
    private String addr;
    /**
     * 地址2
     * @eo.required
     */
    private String addr2;

    public UserDto() {
    }

    public UserDto(String userName, Integer ages, List<String> nickNames) {
        this.userName = userName;
        this.ages = ages;
        this.nickNames = nickNames;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAges() {
        return ages;
    }

    public void setAges(Integer ages) {
        this.ages = ages;
    }

    public List<? extends UserDto> getFriends() {
        return friends;
    }

    public void setFriends(List<? extends UserDto> friends) {
        this.friends = friends;
    }

    public List<String> getNickNames() {
        return nickNames;
    }

    public void setNickNames(List<String> nickNames) {
        this.nickNames = nickNames;
    }

    public String[] getMobile() {
        return mobile;
    }

    public void setMobile(String[] mobile) {
        this.mobile = mobile;
    }

    public Map<String, UserDto> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, UserDto> maps) {
        this.maps = maps;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }
}