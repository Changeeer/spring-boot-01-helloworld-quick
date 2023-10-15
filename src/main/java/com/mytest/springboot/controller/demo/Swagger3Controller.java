package com.mytest.springboot.controller.demo;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.demo.Swagger2User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @eo.group-name Swagger3分组
 */
@Path("/swagger3")
@RestController
@RequestMapping("/swagger3")
public class Swagger3Controller {


    /**
     * @eo.name 保存用户
     * @url /saveUser
     * @eo.method get
     * @eo.request-type formdata
     * @param user
     * @return ResponseParams
     */
    @POST
    @Path("/saveUser")
    @Operation(summary = "保存用户22222")
    @Parameters({
            @Parameter(name = "user", description = "用户", required = true)
    })
    @RequestMapping("/saveUser")
    public ResponseParams<String> saveUser(Swagger2User user) {
        return null;
    }


    /**
     * @eo.name 其他用例
     * @url /other
     * @eo.method get
     * @eo.request-type formdata
     * @param usereo.name
     * @param password
     * @return String
     */
    @POST
    @Path("/other")
    @Operation(summary = "其他用例")
    @RequestMapping("/other")
    public String other(@Schema(name = "帐号", required = true) String username,
                        @Schema(name = "密码", required = true) String password) {
        return null;
    }
}
