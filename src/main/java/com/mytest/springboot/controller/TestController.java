package com.mytest.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.Department;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @eo.api-type http
 * @eo.group-name 默认
 * @eo.path /eolink
 */
@RestController
@RequestMapping(value = "/eolink")
public class TestController {

	/**
	 * @eo.name testUserDto
	 * @eo.url /map/userDto
	 * @eo.method get
	 * @eo.request-type formdata
	 * @param userDto
	 * @return ResponseParams
	 */
	@RequestMapping({"map/userDto"})
	public ResponseParams<Map<String,UserDto>> testUserDto(UserDto userDto) {
		return null;
	}

	/**
	 * @param params params
	 * @return {@link Map<String, UserDto>}
	 * @DocView.Name testData
	 * @eo.name testData
	 * @eo.url /list/lists
	 * @eo.method get
	 * @eo.request-type json
	 */
	@RequestMapping(value = {"list/lists"},headers= {"test_header=abc"})
	public Map<String, UserDto> testData(@RequestBody RequestParams<List<List<Map<String, UserDto>>>> params) {
//		UserDto userDto = params.getData();
//		return userDto.getAges();
		System.out.println(JSON.toJSONString(params));
		return new HashMap<>();
	}

	/**
	 * @eo.name testListObject
	 * @eo.url /list/object
	 * @eo.method get
	 * @eo.request-type json
	 * @param params
	 * @return List
	 */
	@RequestMapping(value = {"list/object"},headers= {"test_header=abc"})
	public List<UserDto> testListObject(@RequestBody RequestParams<List<UserDto>> params) {
//		UserDto userDto = params.getData();
//		return userDto.getAges();
		System.out.println(JSON.toJSONString(params));
		return new ArrayList<>();
	}

	/**
	 * @eo.name 请求无返回
	 * @eo.url /name
	 * @eo.method post
	 * @eo.request-type json
	 * @param name
	 * @return void
	 */
	@PostMapping(value = "/name", produces = "application/json;charset=UTF-8")
	public void printName(@RequestBody String name) {
		System.out.println(name);
	}

	/**
     * @eo.name 方案新增需要默认维护的数据
     * @eo.url /
     * @eo.method post
     * @eo.request-type json
     * @param vo
     * @return Long
     * @param userDto {@eo.hidden}
     */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Long abd(@RequestBody NormalVO vo, UserDto userDto) {
		return null;
	}


	/**
	 * @eo.name 123
	 * @eo.url /delay
	 * @eo.method get
	 * @eo.request-type formdata
	 * @param min 延迟时间，单位为分钟
	 * @return PlainResult
	 */
	@GetMapping(value = "/delay")
	public PlainResult delay(int min) {
		return null;
	}

	/**
	 * @eo.name init
	 * @eo.url /
	 * @eo.method get
	 * @eo.request-type formdata
	 * @return PlainResult
	 */
	@RequestMapping
	public PlainResult init() {
		System.out.println("123");
		return new PlainResult();
	}

}
