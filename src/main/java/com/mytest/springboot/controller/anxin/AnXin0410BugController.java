package com.mytest.springboot.controller.anxin;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.anxin.AnxinDataDto;
import com.mytest.springboot.dto.anxin.AnxinSetterDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @eo.api-type http
 * @eo.group-name 安信0410
 * @eo.path /lombok-test
 */
@Slf4j
@RestController
@RequestMapping("lombok-test")
public class AnXin0410BugController {

    @PostMapping("/test1")
    public ResponseParams<String> test1(@RequestBody AnxinDataDto dto){
        System.out.println(dto.toString());
        log.info("{}", dto);
        return null;
    }

    @PostMapping("/test2")
    public ResponseParams<Boolean> test2(@RequestBody AnxinSetterDto dto){
        System.out.println(dto.toString());
        log.info("{}", dto);
        return null;
    }
}
