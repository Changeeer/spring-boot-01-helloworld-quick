package com.mytest.springboot.controller.structure;

import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/structure")
public class StructureUploadController {

    @GetMapping("/get-data")
    public String rawResp(Long id, String token, boolean getAllDetail) {
        return null;
    }

    @PostMapping("/post-data")
    public ResponseParams<NormalVO> getNormalByUser(RequestParams<List<UserDto>> req) {
        return null;
    }
}
