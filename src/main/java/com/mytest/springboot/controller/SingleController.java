package com.mytest.springboot.controller;

import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.SupermanDto;
import com.szbank.dto.Carda;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @eo.api-type http
 * @eo.groupName 0520-http
 * @eo.path /single4
 */

@RestController
@RequestMapping("/single4")
public class SingleController {


    /**
     * @eo.name getCarda
     * @eo.url /carda
     * @eo.method get
     * @eo.request-type json
     * @param supermanDto
     * @return Carda
     */
    @PostMapping("/carda")
    public Carda getCarda(@RequestBody List<SupermanDto> supermanDto) {
        return null;
    }


    /**
     * @eo.name helloWorld
     * @eo.url /hello
     * @eo.method get
     * @eo.request-type formdata
     * @param name
     * @return ResponseParams
     */
    @GetMapping("/hello")
    public ResponseParams<String> helloWorld(String name){
        return null;
    }


    /**
     * @eo.name deleteUser
     * @eo.url /delete
     * @eo.method delete
     * @eo.request-type formdata
     * @param userId
     * @param request
     * @return PlainResult
     */
    @DeleteMapping("/delete")
    public PlainResult<Long> deleteUser(Integer userId, HttpServletRequest request){
        return null;
    }

}

























