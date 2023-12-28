package com.mytest.springboot.controller.anxin;

import com.mytest.springboot.common.ResponseParams;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysOverview")
public class AnXin1220BugController {

    @RequestMapping("/private-hello")
    private ResponseParams<String> helloWorld(String name, String abc, Integer sss){
        return null;
    }
}
