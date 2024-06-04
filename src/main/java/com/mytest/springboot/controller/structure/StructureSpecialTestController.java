package com.mytest.springboot.controller.structure;

import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.*;

/**
 * @eo.api-type http
 * @eo.group-name 数据结构测试.特殊测试
 * @eo.path /structure-special-test
 */

@RestController
@RequestMapping("/structure-special-test")
public class StructureSpecialTestController {

//    /**
//     * @eo.name get-数据结构
//     * @eo.url /normal
//     * @eo.method get
//     * @eo.request-type formdata
//     * @param result
//     * @param name
//     * @param userDto
//     * @return PlainResult
//     */
//    @GetMapping("/normal")
//    public ResponseParams<Boolean> helloWorld(ResponseParams result, String name, UserDto userDto){
//        return null;
//    }

    /**
     * @eo.name 第三方包
     * @eo.url /test-group
     * @eo.method post
     * @eo.request-type json
     * @param user
     * @return PlainResult
     */
    @PostMapping("/test-group")
    public PlainResult<Long> s2TestGroup(@RequestBody PlainResult<UserDto> user) {
        return null;
    }


}
