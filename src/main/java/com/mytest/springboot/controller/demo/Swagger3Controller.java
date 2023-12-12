package com.mytest.springboot.controller.demo;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.demo.Swagger2User;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    @POST
    @Path("/saveUser")
    @Operation(summary = "保存用户22222")
    @Parameters({
            @Parameter(name = "user", description = "用户", required = true),
            @Parameter(name = "abc", description = "cba")
    })
    @RequestMapping("/saveUser")
    public ResponseParams<String> saveUser(Swagger2User user, Integer abc) {
        return null;
    }


    @POST
    @Path("/other")
    @Operation(summary = "其他用例")
    @RequestMapping("/other")
    public String other(@Schema(name = "帐号", required = true) String username,
                        @Schema(name = "密码", required = true) String password) {
        return null;
    }

    @POST
    @Path("/other-v2")
    @Operation(summary = "其他用例v2", parameters = {
            @Parameter(name = "username", description = "用户v2", required = true),
            @Parameter(name = "password", description = "密码v2"),
            @Parameter(name = "id", hidden = true)
    })
    @RequestMapping("/other-v2")
    public String saveUserV2(String username, String password, Long id) {
        return null;
    }
}
