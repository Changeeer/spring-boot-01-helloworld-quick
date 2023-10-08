package com.mytest.springboot.api.impl;

import com.mytest.springboot.api.UserService;
import com.mytest.springboot.dto.Address;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.SupermanDto;
import com.mytest.springboot.dto.UserDto;
import com.mytest.springboot.dto.base.SpecialResult;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;
import java.util.Map;



public class UserServiceApiImpl implements UserService {


    /**
     * @eo.name getUserById
     * @eo.url
     * @eo.method get
     * @eo.request-type formdata
     * @param id
     * @return UserDto
     */
    @Override
    public UserDto getUserById(Long id) {
        return null;
    }


    /**
     * @eo.name getSupermanByUser
     * @eo.url
     * @eo.method get
     * @eo.request-type formdata
     * @param user
     * @return SupermanDto
     */
    @Override
    public SupermanDto getSupermanByUser(UserDto user) {
        return null;
    }

    /**
     * @eo.name getSuperSkill
     * @eo.url
     * @eo.method get
     * @eo.request-type formdata
     * @param username
     * @return String
     */
    @Override
    public String getSuperSkill(String username) {
        return null;
    }

    /**
     * @eo.name getAllUsers
     * @eo.url
     * @eo.method get
     * @eo.request-type formdata
     * @return List
     */
    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    /**
     * @eo.name getUserIdMaps
     * @eo.url
     * @eo.method get
     * @eo.request-type formdata
     * @param ids
     * @return Map
     */
    @Override
    public Map<String, UserDto> getUserIdMaps(List<Integer> ids) {
        return null;
    }

    /**
     * @eo.name getNormal
     * @eo.url
     * @eo.method get
     * @eo.request-type formdata
     * @param normalVO
     * @return NormalVO
     */
    @Override
    public NormalVO getNormal(NormalVO normalVO) {
        return null;
    }

    /**
     * @eo.name getAddress
     * @eo.url
     * @eo.method get
     * @eo.request-type formdata
     * @param add
     * @return SpecialResult
     */
    public SpecialResult<Long, Address> getAddress(Address add) {
        return null;
    }
}
