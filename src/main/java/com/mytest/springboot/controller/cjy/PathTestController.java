package com.mytest.springboot.controller.cjy;

import com.mytest.springboot.dto.UserDto;
import com.szbank.dto.Carda;
import org.springframework.web.bind.annotation.*;


/**
 * @eo.api-type http
 * @eo.group-name 默认分组
 * @eo.path /api
 */

@RestController
@RequestMapping("api")
public class PathTestController {

    /**
     * @param userDto
     * @return String
     * @eo.name test1
     * @url /
     * @eo.method get
     * @eo.request-type formdata
     * @eo.url /
     */
    @GetMapping()
    public String test1(UserDto userDto) {
        return null;
    }

    /**
     * @param carda
     * @return String
     * @eo.name test222
     * @url /test2
     * @eo.method get
     * @eo.request-type formdata
     * @eo.url /test2
     */
    @GetMapping("test2")
    public String test2(Carda carda) {
        return null;
    }


    /**
     * @param id a
     * @param name {@required} b
     * @param key {@required} c
     * @return String
     * @eo.name test3
     * @url /test3
     * @eo.method get
     * @eo.request-type formdata
     * @eo.url /test3
     */
    @GetMapping("/test3")
    public String test3(String id,String name,String key) {
        return null;
    }


}
