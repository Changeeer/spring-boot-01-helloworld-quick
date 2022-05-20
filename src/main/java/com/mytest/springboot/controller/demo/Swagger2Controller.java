package com.mytest.springboot.controller.demo;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.demo.EolinkUser;
import com.mytest.springboot.dto.demo.Swagger2User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @eo.groupName Swagger2分组
 */
@Api(basePath = "/swagger2")
@RestController
@RequestMapping("/swagger2")
public class Swagger2Controller {


    @ApiOperation("保存用户")
    // 暂无请求方法分析
    // 暂无url分析
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户", required = true)
    })
    // @ApiIgnore
    @RequestMapping("/saveUser")
    public ResponseParams<String> saveUser(Swagger2User user) {
        return null;
    }
}
