package com.mytest.springboot.controller.xq0822;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.demo.Swagger3User;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @eo.api-type http
 * @eo.group-name xq-0822
 * @eo.path /xq-0822
 */
@RestController
@RequestMapping("/xq-0822")
public class XQ0822Controller {

    /**
     * 获取用户信息
     * @param user
     * @return
     */
    @PostMapping("/get-user")
    public ResponseParams<Swagger3User> getUser (@RequestBody Swagger3User user) {
        return null;
    }

    /**
     * 普通入参测试
     * @return
     */
    @GetMapping("/simple-args")
    public ResponseParams<Long> simpleArgs(@Schema(name = "ID", type = "int", description = "long类型转int") Long id,
                                           @Schema(name = "user_name", description = "用户名", required = true, example = "cxx")  String name,
                                           @Schema(hidden = true) HttpServletRequest request){
        return null;
    }
}
