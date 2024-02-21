package com.mytest.springboot.controller.cjy;

import com.mytest.springboot.common.ResponseParams;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @eo.api-type http
 * @eo.groupName 默认分组
 * @eo.path /anxin/swagger2
 */

@RestController
@RequestMapping("/anxin/swagger2")
@Api(tags = "a/b/c")
public class TagGroup1120Controller {

    /**
     * @eo.name say hello get
     * @eo.url /hello-get-v2
     * @eo.method get
     * @eo.request-type formdata
     * @param name
     * @param id
     * @return ResponseParams
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字"),
            @ApiImplicitParam(name = "id", value = "唯一字段", required = true),
    })
    @GetMapping("/hello-get-v2")
    @ApiOperation(value = "say hello get", tags = {"test group s2"})
    public ResponseParams<String> helloGet(String name, Long id) {
        return null;
    }

    /**
     * @eo.name say hello post
     * @eo.url /hello-post-v2
     * @eo.method post
     * @eo.request-type formdata
     * @param name
     * @param id
     * @return ResponseParams
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字"),
            @ApiImplicitParam(name = "id", value = "唯一字段", required = true),
    })
    @PostMapping("/hello-post-v2")
    @ApiOperation(value = "say hello post")
    public ResponseParams<String> helloPost(String name, Long id) {
        return null;
    }
}
