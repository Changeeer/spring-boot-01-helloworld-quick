package com.mytest.springboot.controller;

import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.SupermanDto;
import com.mytest.springboot.dto.UserDto;
import com.szbank.dto.Carda;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @eo.api-type http
 * @eo.group-name single
 * @eo.path /single4
 */

@RestController
@RequestMapping("/single4")
public class SingleController {

    /**
     * @eo.name getCarda
     * @eo.url /carda
     * @eo.method post
     * @eo.request-type json
     * @param supermanDto
     * @return Carda
     * @eo.group-name single1
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
     * @eo.group-name single2
     */
    @GetMapping("/hello")
    public ResponseParams<Integer> helloWorld(String name){
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
     * @eo.group-name single3
     */
    @DeleteMapping("/delete")
    public PlainResult<Long> deleteUser(Integer userId, HttpServletRequest request){
        return null;
    }

    /**
     * @eo.name helloWorld
     * @eo.url /normal
     * @eo.method get
     * @eo.request-type formdata
     * @param result
     * @param name
     * @param userDto
     * @return PlainResult
     * @eo.group-name single4
     */
    @GetMapping("/normal")
    public PlainResult<NormalVO> helloWorld(ResponseParams result, String name, UserDto userDto){
        return null;
    }

}

























