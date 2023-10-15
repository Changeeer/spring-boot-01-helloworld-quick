package com.mytest.springboot.controller;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.*;


/**
 * @eo.path /plugin
 * @eo.group-name 12-22测试
 * @eo.api-type http
 */
@RestController
@RequestMapping("/plugin")
public class AController {
//public class AController extends BaseController<String[], Long>{

    /**
     * hello for test
     * @url /hello
     * @eo.method post
     * @param name 名字 {@eo.required}
     * @return 招呼语
     * @eo.name hello for test
     * @eo.url /hello
     * @eo.request-type formdata
     * @param sss 生生生 {@eo.hidden}
     * @param abc 安保处
     */
    @RequestMapping("/hello")
    public ResponseParams<String> helloWorld(String name, String abc, Integer sss){
        return null;
    }

}

