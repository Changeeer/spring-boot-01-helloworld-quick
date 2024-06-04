package com.mytest.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    /**
     * 用户名222
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
//    private List<UserDto> friends;
    private List<? extends UserDto> friends;
    /**
     * 昵称
     */
    private List<String> nickNames;
    /**
     * 电话
     * @required
     */
    private String[] mobile;
    /**
     * 这是一个map
     */
    private Map maps;
//    private Class<? extends Exception> e;

    /**
     * 父类
     */
    private UserDto father;

    private List<Address> addressList;


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

    public void setFriends(List<UserDto> friends) {
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

    public UserDto getFather() {
        return father;
    }

    public void setFather(UserDto father) {
        this.father = father;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}