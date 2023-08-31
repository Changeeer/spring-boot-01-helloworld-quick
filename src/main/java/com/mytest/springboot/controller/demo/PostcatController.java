package com.mytest.springboot.controller.demo;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.demo.PostcatUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PUT;

/**
 * @eo.group-name 默认分组
 * @eo.api-type http
 * @eo.groupName 默认分组
 * @eo.path /postcat
 */

@RestController
@RequestMapping("/postcat")
public class PostcatController {

    /**
     * @param user
     * @return ResponseParams
     * @eo.name 保存用户2
     * @url /saveUser
     * @eo.method put
     * @eo.request-type formdata
     */
    @ApiOperation("保存用户2")  // swagger2
    @PUT    // swagger3
    @RequestMapping("/saveUser")
    public ResponseParams<String> saveUser(PostcatUser user) {
        return null;
    }

    /**
     * @param id 用户id {@required}
     * @return PostcatUser
     * @eo.name getUser
     * @url /
     * @eo.method get
     * @eo.request-type formdata
     */
    @GetMapping
    public PostcatUser getUser(Long id) {
        return null;
    }
}
