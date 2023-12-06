package com.mytest.springboot.controller.anxin;

import com.mytest.springboot.common.ResponseParams;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anxin/swagger2")
@Api(tags = "安信分组s2")
public class AnXinSwagger2Controller {

    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字"),
            @ApiImplicitParam(name = "id", value = "唯一字段", required = true),
    })
    @GetMapping("/hello-get")
    @ApiOperation(value = "say hello get", tags = {"test group s2"})
    public ResponseParams<String> helloGet(String name, Long id) {
        return null;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字"),
            @ApiImplicitParam(name = "id", value = "唯一字段", required = true),
    })
    @PostMapping("/hello-post")
    @ApiOperation(value = "say hello post")
    public ResponseParams<String> helloPost(String name, Long id) {
        return null;
    }

}
