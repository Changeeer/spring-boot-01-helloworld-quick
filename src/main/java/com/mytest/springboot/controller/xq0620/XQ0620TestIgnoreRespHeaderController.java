package com.mytest.springboot.controller.xq0620;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @eo.api-type http
 * @eo.group-name xq-0620
 * @eo.path /xq-0620-2
 * @eo.global-response-header.ignore
 */
@RestController
@RequestMapping("/xq-0620-2")
public class XQ0620TestIgnoreRespHeaderController {

    /**
     * @param uuid     uuid
     * @param userName 帐号
     * @return Object
     * @eo.name testIgnoreHeader
     * @eo.url /test/class-ignore-resp-header
     * @eo.method post
     * @eo.request-type formdata
     */
    @PostMapping("/test/class-ignore-resp-header")
    public Object testIgnoreHeader(String uuid, String userName) {
        return null;
    }

}
