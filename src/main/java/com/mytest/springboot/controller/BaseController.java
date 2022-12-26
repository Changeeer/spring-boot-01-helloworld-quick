package com.mytest.springboot.controller;


import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import com.mytest.springboot.dto.base.SpecialResult;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/base")
    protected SpecialResult<T, PK> base() {
        return null;
    }
}
