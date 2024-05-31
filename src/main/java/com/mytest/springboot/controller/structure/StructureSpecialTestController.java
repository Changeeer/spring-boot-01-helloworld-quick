package com.mytest.springboot.controller.structure;

import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import com.mytest.springboot.dto.demo.Swagger2User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
