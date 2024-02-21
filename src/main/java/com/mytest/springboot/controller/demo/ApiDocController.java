package com.mytest.springboot.controller.demo;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.UserDto;
import com.mytest.springboot.dto.demo.EolinkUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PUT;


@RestController
@RequestMapping("/api-doc")
public class ApiDocController {

    /**
     * 保存用户
     * @param user
     * @return
     */
    @PostMapping("/user")
    public ResponseParams<Long> saveUser(UserDto user) {
        return null;
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/user")
    public ResponseParams<Boolean> deleteUser(Long id) {
        return null;
    }

    /**
     * 获取用户
     * @param id
     * @return
     */
    @GetMapping("/user")
    public ResponseParams<UserDto> getUser(Long id) {
        return null;
    }

    /**
     * 查询用户
     * @param query
     * @return
     */
    @PostMapping("/user/query")
    public ResponseParams<UserDto> queryUser(UserDto query) {
        return null;
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @PutMapping("/user")
    public ResponseParams<Boolean> updateUser(UserDto user) {
        return null;
    }
}
