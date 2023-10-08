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


///**
// * @eo.api-type dubbo
// * @eo.group-name 默认分组
// * @eo.path
// * @eo.rpc-version v0.0.1
// * @eo.rpc-group com.mytest.springboot.api
// */

//@DubboService(version = "v0.0.1")
public class UserServiceImpl implements UserService {

    /**
     * @eo.name getUserById
     * @param id
     * @return UserDto
     */
    @Override
    public UserDto getUserById(Long id) {
        return null;
    }

    /**
     * @eo.name getSupermanByUser
     * @param user
     * @return SupermanDto
     */
    @Override
    public SupermanDto getSupermanByUser(UserDto user) {
        return null;
    }

    /**
     * @eo.name getSuperSkill
     * @param username
     * @return String
     */
    @Override
    public String getSuperSkill(String username) {
        return null;
    }

    /**
     * @eo.name getAllUsers
     * @return List
     */
    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    /**
     * @eo.name getUserIdMaps
     * @param ids
     * @return Map
     */
    @Override
    public Map<String, UserDto> getUserIdMaps(List<Integer> ids) {
        return null;
    }

    /**
     * @eo.name getNormal
     * @param normalVO
     * @return NormalVO
     */
    @Override
    public NormalVO getNormal(NormalVO normalVO) {
        return null;
    }

    /**
     * @eo.name getAddress
     * @param add
     * @return SpecialResult
     */
    public SpecialResult<Long, Address> getAddress(Address add) {
        return null;
    }
}
