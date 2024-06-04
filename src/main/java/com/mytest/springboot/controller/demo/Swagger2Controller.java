package com.mytest.springboot.controller.demo;

import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.demo.Swagger2User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(basePath = "/swagger2", tags = "swagger/v2")
@RestController
@RequestMapping("/swagger2")
public class Swagger2Controller {

    @ApiOperation("保存用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户", required = true),
            @ApiImplicitParam(name = "num", value = "數量", required = true),
    })
    @RequestMapping("/saveUser")
    public ResponseParams<String> saveUser(Swagger2User user, String num) {
        return null;
    }

    @ApiOperation("s2分组测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户数据"),
    })
    @PostMapping("/test-group")
    public PlainResult<Long> s2TestGroup(Swagger2User user) {
        return null;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字"),
            @ApiImplicitParam(name = "id", value = "唯一字段", required = true),
    })
    @GetMapping("/swagger-v2-other")
    @ApiOperation(value = "swagger-v2-other", tags = {"swagger/v2/other"})
    public ResponseParams<String> helloGet(String name, Long id) {
        return null;
    }
}

