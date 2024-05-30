package com.mytest.springboot.controller.structure;

import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @eo.api-type http
 * @eo.group-name 数据结构测试.特殊测试
 * @eo.path /structure-special-test
 */

@RestController
@RequestMapping("/structure-special-test")
public class StructureSpecialTestController {

    /**
     * @eo.name get-数据结构
     * @eo.url /normal
     * @eo.method get
     * @eo.request-type formdata
     * @param result
     * @param name
     * @param userDto
     * @return PlainResult
     */
    @GetMapping("/normal")
    public ResponseParams<Boolean> helloWorld(ResponseParams result, String name, UserDto userDto){
        return null;
    }
}
