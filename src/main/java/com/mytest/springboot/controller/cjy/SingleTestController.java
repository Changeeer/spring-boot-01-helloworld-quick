package com.mytest.springboot.controller.cjy;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.dto.UserDto;
import com.szbank.dto.Carda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 *
 * @eo.api-type http
 * @eo.group-name postcat
 * @eo.path /cjy
 */
@RestController
@RequestMapping(value = "/cjy")
public class SingleTestController {


    /**
     * @eo.name getUserList
     * @eo.url /get-user
     * @eo.method get
     * @eo.request-type formdata
     * @return PlainResult
     */
    @GetMapping("/get-user")
    public Page<List<UserDto>> getUserList(Carda carda) {
        return null;
    }
}
