package com.mytest.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.Department;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = {"list"}, headers = {"p_header=p"})
public class TestController {

	@RequestMapping({"map/userDto"})
	public ResponseParams<Map<String,UserDto>> testUserDto(UserDto userDto) {
		return null;
	}

	/**
	 * @param params params
	 * @return {@link Map<String, UserDto>}
	 * @DocView.Name testData
	 */
	@RequestMapping(value = {"list/lists"},headers= {"test_header=abc"})
	public Map<String, UserDto> testData(@RequestBody RequestParams<List<List<Map<String, UserDto>>>> params) {
//		UserDto userDto = params.getData();
//		return userDto.getAges();
		System.out.println(JSON.toJSONString(params));
		return new HashMap<>();
	}

	@RequestMapping(value = {"list/object"},headers= {"test_header=abc"})
	public List<UserDto> testListObject(@RequestBody RequestParams<List<UserDto>> params) {
//		UserDto userDto = params.getData();
//		return userDto.getAges();
		System.out.println(JSON.toJSONString(params));
		return new ArrayList<>();
	}
}
