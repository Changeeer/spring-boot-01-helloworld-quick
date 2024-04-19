package com.mytest.springboot.controller.structure;

import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @eo.api-type http
 * @eo.groupName 数据结构测试
 * @eo.path /structure
 */

@RestController
@RequestMapping("/structure")
public class StructureUploadController {

    /**
     * @eo.name get请求返回raw
     * @eo.url /get-data
     * @eo.method get
     * @eo.request-type formdata
     * @param id
     * @param token
     * @param getAllDetail
     * @return String
     */
    @GetMapping("/get-data")
    public String rawResp(Long id, String token, boolean getAllDetail) {
        return null;
    }

    /**
     * @eo.name post请求数据结构
     * @eo.url /post-data
     * @eo.method post
     * @param req
     * @return ResponseParams
     * @eo.request-type json
     */
    @PostMapping("/post-data")
    public ResponseParams<NormalVO> getNormalByUser(@RequestBody RequestParams<List<UserDto>> req) {
        return null;
    }
}
