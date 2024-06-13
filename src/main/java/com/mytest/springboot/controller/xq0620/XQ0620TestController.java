package com.mytest.springboot.controller.xq0620;

import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.*;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import java.util.Map;


/**
 * @eo.api-type http
 * @eo.group-name xq-0620
 * @eo.path /xq-0620
 * @eo.global-request-header app_id 应用id
 * @eo.global-request-header sign 密钥
 * @eo.global-request-header timestamp 时间戳 {@eo.required false}
 * @eo.global-response-header request_id 请求id
 */
@RestController
@RequestMapping("/xq-0620")
public class XQ0620TestController {

    /**
     * @eo.name testIgnoreHeader
     * @eo.url /test/ignore-header
     * @eo.method post
     * @eo.request-type formdata
     * @param id
     * @param name
     * @return Object
     * @eo.global-response-header.ignore
     * @eo.global-request-header.ignore
     */
    @PostMapping("/test/ignore-header")
    public Object testIgnoreHeader(String id, String name) {
        return null;
    }

    /**
     * 测试@RequestParam
     *
     * @param id           这是uuid
     * @param token        这是token
     * @param getAllDetail 是否要全部数据
     * @return String
     * @param uuid
     * @eo.name 测试@RequestParam
     * @eo.url /test/request-param
     * @eo.method get
     * @eo.request-type formdata
     * @eo.global-request-header.ignore
     */
    @GetMapping("/test/request-param")
    public String requestParam(@RequestParam(name = "uuid") @NotEmpty Long id, @NotBlank String token, boolean getAllDetail) {
        return null;
    }

    /**
     * 测试json序列化
     *
     * @param req 咩咩咩
     * @return ResponseParams
     * @eo.name 测试json序列化
     * @eo.url /test/json-serialized
     * @eo.method post
     * @eo.request-type json
     * @eo.global-response-header.ignore
     */
    @PostMapping("/test/json-serialized")
    public BaseRequest jsonSerialized(@RequestBody RequestParams<Address> req) {
        return null;
    }


    /**
     * @param jwt
     * @param userId
     * @param name
     * @return BaseRequest
     * @eo.name springMVCHeader
     * @eo.url /springmvc-header
     * @eo.method get
     * @eo.request-type formdata
     * @eo.request-header user_id  {@eo.required false}
     * @eo.request-header jwt
     */
    @GetMapping("/springmvc-header")
    public BaseRequest springMVCHeader(@RequestHeader(value = "jwt") String jwt,
                                       @RequestHeader(value = "user_id", required = false) Long userId,
                                       String name) {
        return null;
    }


    /**
     * @param jwt
     * @return ResponseParams
     * @eo.name swagger示例接口1
     * @eo.url /swagger-req-header-1
     * @eo.method get
     * @eo.request-type formdata
     * @eo.request-header jwt 这是一个jwt
     */
    @ApiOperation(value = "swagger示例接口1")
    @ApiImplicitParam(name = "jwt", value = "这是一个jwt", required = true, dataType = "string", paramType = "header")
    @GetMapping("/swagger-req-header-1")
    public ResponseParams<String> swaggerReqHeader1(@RequestHeader("jwt") String jwt) {
        return null;
    }


    /**
     * @return ResponseParams
     * @eo.name swagger示例接口2
     * @eo.url /swagger-req-header-2
     * @eo.method get
     * @eo.request-type formdata
     * @eo.request-header Header-Two 第二个自定义请求头参数 {@eo.required false}
     * @eo.request-header Header-One 第一个自定义请求头参数
     * @eo.response-header Custom-Response-Header 这是一个自定义的响应头
     * @eo.response-header Another-Response-Header 另一个自定的响应头
     */
    @ApiOperation(value = "swagger示例接口2")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Header-One", value = "第一个自定义请求头参数", required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = "Header-Two", value = "第二个自定义请求头参数", required = false, dataType = "int", paramType = "header"),
            @ApiImplicitParam(name = "userId", value = "用户id", required = true)
    })
    @ApiResponse(code = 200, message = "成功", responseHeaders = {
            @ResponseHeader(name = "Custom-Response-Header", description = "这是一个自定义的响应头", response = String.class),
            @ResponseHeader(name = "Another-Response-Header", description = "另一个自定的响应头", response = String.class)
    })
    @GetMapping("/swagger-req-header-2")
    public ResponseParams<Integer> swaggerReqHeader2(@RequestHeader("Header-One") String headerOne,
                                                     @RequestHeader(value = "Header-Two", required = false) String headerTwo,
                                                     Long userId) {
        return null;
    }


    /**
     * @param rjwt
     * @param userId
     * @param name
     * @return BaseRequest
     * @eo.name eoHeader
     * @eo.url /eo-header
     * @eo.method get
     * @eo.request-type formdata
     * @eo.request-header r-jwt
     * @eo.request-header user_id  {@eo.required false}
     * @eo.response-header key 返回密钥
     */
    @GetMapping("/eo-header")
    public BaseRequest eoHeader(@RequestHeader(value = "r-jwt") String rjwt,
                                       @RequestHeader(value = "user_id", required = false) Long userId,
                                       String name) {
        return null;
    }

    @GetMapping("/eo-header-tag")
    public BaseRequest eoHeaderTestCreateDoc(@RequestHeader(value = "r-jwt") String rjwt,
                                @RequestHeader(value = "user-id", required = false) Long userId,
                                String name) {
        return null;
    }
}
