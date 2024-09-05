package com.mytest.springboot.controller.xq0704;

import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.constant.Status;
import com.mytest.springboot.dto.PageQuery;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @eo.api-type http
 * @eo.group-name 默认分组
 * @eo.path /xq-0704
 */
@RestController
@RequestMapping("/xq-0704")
public class EnumTestController {

    /**
     *
     * @param status
     * @param size
     * @param sex {@eo.enums 0=男,1=女}
     * @return
     * @eo.name 获取状态
     * @eo.url /status
     * @eo.method get
     * @eo.request-type formdata
     */
    @ApiOperation(value = "获取状态")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "size", value = "大小", allowableValues = "A,B,C,D")
    })
    @GetMapping("/status")
    public String getStatus(
            @ApiParam(value = "状态", required = true)
            @RequestParam Status status, Object size, Integer sex) {
        return "当前状态是: " + status;
    }

    /**
     * @eo.name 测试枚举
     * @eo.url /enum
     * @eo.method post
     * @eo.request-type formdata
     * @param requestParams
     * @return ResponseParams
     */
    @ApiOperation(value = "测试枚举")
    @PostMapping("/enum")
    public ResponseParams<String> testEnum(RequestParams<Status> requestParams) {
        return null;
    }

    /**
     * @eo.name 测试枚举2
     * @eo.url /enum-2
     * @eo.method post
     * @eo.request-type formdata
     * @param query
     * @return ResponseParams
     */
    @ApiOperation(value = "测试枚举2")
    @PostMapping("/enum-2")
    public ResponseParams<String> testEnum2(PageQuery query) {
        return null;
    }
}
