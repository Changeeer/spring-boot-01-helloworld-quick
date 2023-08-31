package com.mytest.springboot.controller;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.*;


/**
 * @eo.path /plugin
 * @eo.group-name 12-22测试
 */
@RestController
@RequestMapping("/plugin")
public class AController {
//public class AController extends BaseController<String[], Long>{

    /**
     * hello for test
     * @url /hello
     * @eo.method post
     * @param name 名字 {@required}
     * @return 招呼语
     */
    @RequestMapping("/hello")
    public ResponseParams<String> helloWorld(String name){
        return new ResponseParams<>("hello world " + name);
    }

    /**
     * 通过id获取用户
     * @url /user
     * @eo.method post
     * @param id
     */
    @GetMapping("/user")
    public String getUserById(Long id) {
        return null;
    }

    /**
     * M-2
     * @return count
     */
    @GetMapping("/user/count")
    public int getUserCount(String a) {
        return 100;
    }


    /**
     * 保存用户
     * @url /user
     * @param user 用户数据
     * @param id 用户id
     * @return 用户id
     */
    @PostMapping("/user")
    public ResponseParams<Long> saveUser(UserDto user, Long id) {
        return new ResponseParams<>(1L);
    }
//
//    @GetMapping("/user/map")
//    public ResponseParams<Map<Long, UserDto>> getUserMap(String name) {
//        return null;
//    }
//
//    @GetMapping("/map")
//    public Map<String, String> getMap() {
//        return null;
//    }
//
//    @GetMapping("/string")
//    public String getName() {
//        return "name";
//    }
//
//    @GetMapping("/isHot")
//    public boolean isHot() {
//        return true;
//    }

//    @GetMapping("/department")
//    public Department getDepartment(long id, String name, Map<String,String> map, Department department) {
//        return null;
//    }

//    @GetMapping("/carda")
//    public Carda getCarda(SupermanDto supermanDto) {
//        return null;
//    }

//    @GetMapping("/list")
//    public ResponseParams<Map<Long,List<Carda>>> testList(String cardas) {
//        return null;
//    }
}

