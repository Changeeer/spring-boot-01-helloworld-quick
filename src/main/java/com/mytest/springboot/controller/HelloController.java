package com.mytest.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.Department;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

/**
 * @eo.group-name 1-10-test
 * @eo.path /{"test"}
 */
@RestController
@RequestMapping(value = {"test"}, headers = {"p_header=p"})
public class HelloController {

	/**
     * 测试=接口
     * @url /hello
     * @return hello world
     */
	@RequestMapping("/hello")
	public String helloWorld(){
		return "hello world quick";
	}

	@RequestMapping({"default/addUser"})
	public ResponseParams testUserDto(UserDto userDto) {
		System.out.println(JSON.toJSONString(userDto));
		return null;
	}

	@RequestMapping({"json/addUser"})
	public ResponseParams testJsonUserDto(@RequestBody UserDto userDto) {
		return new ResponseParams(userDto);
	}

	@RequestMapping(value = {"post/addUser"},headers= {"test_header=abc"})
	public PlainResult<String> testData(@RequestBody RequestParams<UserDto> params) {
//		UserDto userDto = params.getData();
//		return userDto.getAges();
		System.out.println(JSON.toJSONString(params));
		return null;
	}

	@GetMapping({"default/getUser"})
	public Object testParams(@NotNull(message = "why null?") @DecimalMin(value = "18", message = "must > 18") Integer id, @NotNull String name) {
		return "code.id:" + id + ", name:" + name;
	}

	@GetMapping({"default/getUser/{id}"})
	public ResponseParams<UserDto> testPath(@PathVariable("id") Integer id, String name) {
		return new ResponseParams<>(null);
	}

	@GetMapping({"default/get/{id}"})
	public Object testPathAndParam(@PathVariable("id") Integer id, @RequestParam(value = "nickName" ,required = true) String name) {
		return "code.id:" + id + ", name:" + name;
	}

	@RequestMapping(value = "multi/class", method = RequestMethod.POST)
	public String testMultiClass(@RequestBody RequestParams<Department> departments) {
		return departments.getData().getOriginalName();
	}

	/**
	 * 接口描述信息balabala
	 *
	 * @param name
	 * @param ages
	 * @param flag
	 * @return {@link String}
	 * @DocView.Name 接口名称
	 */
	@PostMapping("/base/variable")
	public String testPostBaseVariable( String name, Integer ages, Boolean flag) {
		System.out.println(name + " | " + ages +" | " +flag);
		return null;
	}
}
