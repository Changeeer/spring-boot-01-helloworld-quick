package com.mytest.springboot.controller.dw;

import com.du.dto.PageRequest;
import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * @eo.api-type http
 * @eo.group-name dw-test
 * @eo.path
 */

public class DWTestController {

    /**
     * @eo.name list
     * @url /list
     * @eo.method post
     * @eo.request-type formdata
     * @param normalVO
     * @return PageRequest
     */
    @PostMapping("/list")
    public PlainResult<String> list(NormalVO normalVO) {
        return null;
    }

}
