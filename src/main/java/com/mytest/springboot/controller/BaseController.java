package com.mytest.springboot.controller;


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
     * @eo.name 这是一个基类接口，所有继承这个Controller都有这个接口
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
