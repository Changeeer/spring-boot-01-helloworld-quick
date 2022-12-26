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


/**
 */

@DubboService(version = "v0.0.1")
public class UserServiceImpl implements UserService {


    /**
     * @param id
     * @return UserDto
     */
    @Override
    public UserDto getUserById(Long id) {
        return null;
    }


    /**
     * @param user
     * @return SupermanDto
     */
    @Override
    public SupermanDto getSupermanByUser(UserDto user) {
        return null;
    }


    /**
     * @param username
     * @return String
     */
    @Override
    public String getSuperSkill(String username) {
        return null;
    }


    /**
     * @return List
     */
    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }


    /**
     * @param ids
     * @return Map
     */
    @Override
    public Map<String, UserDto> getUserIdMaps(List<Integer> ids) {
        return null;
    }

    /**
     * @param normalVO
     * @return NormalVO
     */
    @Override
    public NormalVO getNormal(NormalVO normalVO) {
        return null;
    }

    /**
     * @param add
     * @return SpecialResult
     */
    public SpecialResult<Long, Address> getAddress(Address add) {
        return null;
    }
}
