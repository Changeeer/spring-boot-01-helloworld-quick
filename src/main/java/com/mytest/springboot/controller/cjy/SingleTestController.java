package com.mytest.springboot.controller.cjy;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.eolinker.platform.api.response.BaseResult;
import com.eolinker.platform.api.response.ListResult;
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
 * @eo.groupName 默认分组
 */
@RestController
@RequestMapping(value = "/cjy")
public class SingleTestController {


    /**
     * @eo.name getUserList
     * @eo.url /get-user
     * @eo.method get
     * @eo.request-type formdata
     * @param a
     * @return PlainResult
     */
    @GetMapping("/get-user")
    public Page<List<UserDto>> getUserList(PlainResult<List<List<?>>> a) {
        return null;
    }
}
