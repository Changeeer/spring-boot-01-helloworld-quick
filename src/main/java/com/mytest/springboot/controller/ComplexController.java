package com.mytest.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.UserDto;
import com.szbank.dto.Carda;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @eo.path complex
 */
@RestController
@RequestMapping(value = "/complex")
public class ComplexController extends BaseController<String,String>{

    /**
     * @eo.name 获取分组信息
     * @eo.url /carda
     * @param data 卡片
     * @return 卡片信息
     */
    @PostMapping("/carda")
    public Carda testDependent(@RequestBody RequestParams<Carda> data) {
        data.getData();
        Carda carda = data.getData();
        carda.setName("ch-name");
        return carda;
    }


    /**
     * @eo.name testMap
     * @eo.url 
     * @eo.method get
     * @param name
     * @param id
     * @param mobile
     * @return ResponseParams
     */
    @RequestMapping(value = "/map", method = {RequestMethod.POST,RequestMethod.GET})
    public ResponseParams<UserDto> testMap(@RequestBody String name, Integer id, String mobile){
        UserDto addUser = new UserDto();
        addUser.setUserName("add-username");
        addUser.setAges(20);
        addUser.setNickNames(Arrays.asList("jack","bob","lucy"));
        return null;
    }

    /**
     * @eo.url /list/user
     * @param userDtos 用户信息
     * @return 状态码
     */
    @PostMapping("/list/user")
    public ResponseParams testMapUser(@RequestBody List<UserDto> userDtos){
        UserDto addUser = new UserDto();
        addUser.setUserName("add-username");
        addUser.setAges(20);
        addUser.setNickNames(Arrays.asList("jack","bob","locy"));
        userDtos.add(addUser);
        return null;
    }
}
