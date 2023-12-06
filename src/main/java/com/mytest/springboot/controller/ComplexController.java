package com.mytest.springboot.controller;

import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.UserDto;
import com.mytest.springboot.dto.swagger.User;
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

    /**
     * 已存在的注释
     * @param data
     * @param card
     * @return
     * @eo.name 已存在的注释
     * @eo.url /carda
     * @eo.method post
     * @eo.request-type json
     */
    @PostMapping("/carda")
    public Carda testDependent(@RequestBody RequestParams<UserDto> data, Carda card) {
        return null;
    }

    /**
     * @eo.name testMap
     * @eo.url /map
     * @eo.method post
     * @eo.request-type json
     * @param name
     * @param id
     * @param mobile
     * @return ResponseParams
     */
    @RequestMapping(value = "/map", method = {RequestMethod.POST,RequestMethod.GET})
    public ResponseParams<UserDto> testMap(@RequestBody String name, Integer id, String mobile){
        return null;
    }

    /**
     * @eo.name testMapUser
     * @eo.url /list/user
     * @eo.method get
     * @eo.request-type json
     * @param userDtos
     * @return ResponseParams
     */
    @GetMapping("/list/user")
    public ResponseParams testMapUser(@RequestBody List<UserDto> userDtos){
        return null;
    }
}
