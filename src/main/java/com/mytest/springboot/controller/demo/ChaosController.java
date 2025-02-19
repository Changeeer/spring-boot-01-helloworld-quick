package com.mytest.springboot.controller.demo;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.demo.ChaosUser;
import com.mytest.springboot.dto.demo.EolinkUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PUT;

/**
 * @eo.group-name Chaos分组
 * @eo.path /chaos
 */
@RestController
@RequestMapping("/chaos")
public class ChaosController {

    /**
     * @url /saveUser
     * @param user 用户 {@required}
     * @return
     */
    @ApiOperation("保存用户2")  // swagger2
    @PUT    // swagger3
    @RequestMapping("/saveUser")
    public ResponseParams<String> saveUser(ChaosUser user) {
        return null;
    }
}
