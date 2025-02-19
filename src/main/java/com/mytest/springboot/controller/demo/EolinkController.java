package com.mytest.springboot.controller.demo;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.demo.EolinkUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PUT;

/**
 * @eo.api-type http
 * @eo.group-name Eolink分组
 * @eo.path /eolink @eo.test
 */
@RestController
@RequestMapping("/eolink")
public class EolinkController {

    /**
     * @url /saveUser
     * @eo.method
     * @param user 用户 {@required}
     * @return
     */
    @ApiOperation("保存用户2")  // swagger2
    @PUT    // swagger3
    @RequestMapping("/saveUser")
    public ResponseParams<String> saveUser(EolinkUser user) {
        return null;
    }
}
