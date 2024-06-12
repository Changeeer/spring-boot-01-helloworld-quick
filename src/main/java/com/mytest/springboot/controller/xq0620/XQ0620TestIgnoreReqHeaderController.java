package com.mytest.springboot.controller.xq0620;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @eo.api-type http
 * @eo.group-name xq-0620
 * @eo.path /xq-0620-1
 * @eo.global-request-header.ignore
 */
@RestController
@RequestMapping("/xq-0620-1")
public class XQ0620TestIgnoreReqHeaderController {

    /**
     * @param id id
     * @param name 名称
     * @return Object
     * @eo.name testIgnoreHeader
     * @eo.url /test/class-ignore-req-header
     * @eo.method post
     * @eo.request-type formdata
     */
    @PostMapping("/test/class-ignore-req-header")
    public Object testIgnoreHeader(String id, String name) {
        return null;
    }

}
