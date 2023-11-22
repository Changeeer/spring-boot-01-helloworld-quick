package com.mytest.springboot.controller;


import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import com.mytest.springboot.dto.base.SpecialResult;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * @eo.api-type http
 * @eo.group-name 默认分组
 * @eo.path
 */

public class BaseController<T,PK> {

//    @GetMapping("/void")
//    protected void returnVoidTest(RequestParams<T> t) {
//        JSON.toJSONString(t.getData());
//        return;
//    }

//    @GetMapping("/base/map")
//    protected Map<PK, T> getMap(T t) {
//        return null;
//    }


    /**
     * @eo.name base
     * @eo.url /base
     * @eo.method get
     * @eo.request-type formdata
     * @return SpecialResult
     */
    @GetMapping("/base")
    protected SpecialResult<T, PK> base() {
        return null;
    }
}
