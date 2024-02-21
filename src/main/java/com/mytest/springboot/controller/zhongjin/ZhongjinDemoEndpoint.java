package com.mytest.springboot.controller.zhongjin;

import com.eolinker.platform.api.response.PlainResult;
import com.eolinker.platform.util.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.mytest.springboot.controller.zhongjin.constant.BaseUriConstant.*;


public interface ZhongjinDemoEndpoint {

    @GetMapping(BASE_URI + URI_HELLO)
    PlainResult<String> getUserList(String name);
}
