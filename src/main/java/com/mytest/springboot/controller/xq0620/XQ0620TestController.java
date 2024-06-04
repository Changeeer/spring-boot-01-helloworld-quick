package com.mytest.springboot.controller.xq0620;

import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.dto.*;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;


/**
 * @eo.api-type http
 * @eo.groupName 默认分组
 * @eo.path /xq-0620
 */

@RestController
@RequestMapping("/xq-0620")
public class XQ0620TestController {

    /**
     * 测试@RequestParam
     * @param id           这是uuid
     * @param token        这是token
     * @param getAllDetail 是否要全部数据
     * @return String
     * @eo.name 测试@RequestParam
     * @eo.url /test/request-param
     * @eo.method get
     * @eo.request-type formdata
     */
    @GetMapping("/test/request-param")
    public String requestParam(@RequestParam(name = "uuid") @NotEmpty Long id, @NotBlank String token, boolean getAllDetail) {
        return null;
    }

    /**
     * 测试json序列化
     * @param req 咩咩咩
     * @return ResponseParams
     * @eo.name 测试json序列化
     * @eo.url /test/json-serialized
     * @eo.method post
     * @eo.request-type json
     */
    @PostMapping("/test/json-serialized")
    public BaseRequest jsonSerialized(@RequestBody RequestParams<Address> req) {
        return null;
    }

}
