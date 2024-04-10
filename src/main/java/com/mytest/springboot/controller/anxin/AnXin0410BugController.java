package com.mytest.springboot.controller.anxin;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.anxin.AnxinDataDto;
import com.mytest.springboot.dto.anxin.AnxinSetterDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @eo.api-type http
 * @eo.groupName 安信0410
 * @eo.path /lombok-test
 */
@RestController
@RequestMapping("lombok-test")
public class AnXin0410BugController {

    @RequestMapping("/test1")
    private ResponseParams<String> test1(@RequestBody AnxinDataDto dto){
        return null;
    }

    @RequestMapping("/test2")
    private ResponseParams<String> test2(@RequestBody AnxinSetterDto dto){
        return null;
    }
}
