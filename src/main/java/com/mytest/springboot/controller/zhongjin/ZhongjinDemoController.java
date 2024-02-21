package com.mytest.springboot.controller.zhongjin;

import com.eolinker.platform.api.response.PlainResult;
import com.eolinker.platform.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.mytest.springboot.controller.zhongjin.constant.BaseUriConstant.BASE_PATH;

@Slf4j
@RestController
@RequestMapping(BASE_PATH)
public class ZhongjinDemoController implements ZhongjinDemoEndpoint {

    @Override
    public PlainResult<String> getUserList(String name) {
        log.info("hello {}", name);
        return ResultUtil.buildPlainResult("hello " + name);
    }
}
