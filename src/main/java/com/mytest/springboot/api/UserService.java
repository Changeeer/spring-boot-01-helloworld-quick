package com.mytest.springboot.api;

import com.mytest.springboot.dto.SupermanDto;
import com.mytest.springboot.dto.UserDto;

import java.util.List;
import java.util.Map;

public interface UserService {

    UserDto getUserById(Long id);

    SupermanDto getSupermanByUser(UserDto user);

    String getSuperSkill(String username);

    List<UserDto> getAllUsers();

    Map<String, UserDto> getUserIdMaps(List<Integer> ids);
}
