package com.mytest.springboot.controller.anxin;

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
 * @eo.groupName gbk编码分组
 * @eo.path /anxin-test
 */
@RestController
@RequestMapping("/anxin-gbk-test")
public class AnXinCharsetGBKTestController {

    /**
     * card����
     * @param
     * @return
     */
    @PostMapping("/carda")
    public Carda getCarda(@RequestBody List<SupermanDto> supermanDto) {
        return null;
    }

    // hello����
    @GetMapping("/hello")
    public ResponseParams<Integer> helloWorld(String name){
        return null;
    }

    // cdelete����
    @DeleteMapping("/delete")
    public PlainResult<Long> deleteUser(Integer userId, HttpServletRequest request){
        return null;
    }

    // normal����
    @GetMapping("/normal")
    public PlainResult<NormalVO> helloWorld(ResponseParams result, String name, UserDto userDto){
        return null;
    }

}
