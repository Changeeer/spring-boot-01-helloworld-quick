package com.mytest.springboot.controller;

import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.UserDto;
import com.szbank.dto.Carda;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @eo.api-type http
 * @eo.groupName 默认分组
 * @eo.path /complex
 */
@RestController
@RequestMapping(value = "/complex")
public class ComplexController extends BaseController<String, List<Map<String, UserDto>>>{

    @PostMapping("/carda")
    public Carda testDependent(@RequestBody RequestParams<Carda> data) {
        data.getData();
        Carda carda = data.getData();
        carda.setName("ch-name");
        return carda;
    }
    /**
     * @param name
     * @param id
     * @param mobile
     * @return ResponseParams
     * @eo.name testMap
     * @url /map
     * @eo.method post
     * @eo.request-type json
     */
    @RequestMapping(value = "/map", method = {RequestMethod.POST,RequestMethod.GET})
    public ResponseParams<UserDto> testMap(@RequestBody String name, Integer id, String mobile){
        UserDto addUser = new UserDto();
//        addUser.setUserName("add-username");
//        addUser.setAges(20);
//        addUser.setNickNames(Arrays.asList("jack","bob","lucy"));
        return null;
    }
    /**
     * @param userDtos 用户信息
     * @return 状态码
     * @eo.name testMapUser
     * @url /list/user
     * @eo.method post
     * @eo.request-type json
     */
    @PostMapping("/list/user")
    public ResponseParams testMapUser(@RequestBody List<UserDto> userDtos){
        UserDto addUser = new UserDto();
//        addUser.setUserName("add-username");
//        addUser.setAges(20);
//        addUser.setNickNames(Arrays.asList("jack","bob","locy"));
//        userDtos.add(addUser);
        return null;
    }
}
