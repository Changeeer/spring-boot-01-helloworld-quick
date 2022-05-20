package com.mytest.springboot.controller;

import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.dto.SupermanDto;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @eo.groupName y
 * @eo.path
 */
public interface InterfaceController {


   @GetMapping("/getName")
    PlainResult<String> getName(Long id);


   @PostMapping("/getById")
    PlainResult<UserDto> getUserById(Long id);


   @RequestMapping("/dto")
    String getNameByDto(SupermanDto superman);
}
