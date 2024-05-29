package com.mytest.springboot.controller.structure;

import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @eo.api-type http
 * @eo.groupName 数据结构测试.多普通类型统一返回
 * @eo.path /structure-normal
 */

@RestController
@RequestMapping("/structure-normal")
public class StructureNormalController
{
    /**
     * @eo.name testBoolean
     * @eo.url /testBoolean
     * @eo.method post
     * @eo.request-type json
     * @param req
     * @return ResponseParams
     */
    @PostMapping("/testBoolean")
    public ResponseParams<Boolean> testBoolean(@RequestBody RequestParams<Boolean> req) {
        return null;
    }

    /**
     * @eo.name testString
     * @eo.url /testString
     * @eo.method post
     * @eo.request-type json
     * @param req
     * @return ResponseParams
     */
    @PostMapping("/testString")
    public ResponseParams<String> testString(@RequestBody RequestParams<String> req) {
        return null;
    }

    /**
     * @eo.name testInteger
     * @eo.url /testInteger
     * @eo.method post
     * @eo.request-type json
     * @param req
     * @return ResponseParams
     */
    @PostMapping("/testInteger")
    public ResponseParams<Integer> testInteger(@RequestBody RequestParams<Integer> req) {
        return null;
    }

    /**
     * @eo.name testLong
     * @eo.url /testLong
     * @eo.method post
     * @eo.request-type json
     * @param req
     * @return ResponseParams
     */
    @PostMapping("/testLong")
    public ResponseParams<Long> testLong(@RequestBody RequestParams<Long> req) {
        return null;
    }

    /**
     * @eo.name testListBoolean
     * @eo.url /testListBoolean
     * @eo.method post
     * @eo.request-type json
     * @param req
     * @return ResponseParams
     */
    @PostMapping("/testListBoolean")
    public ResponseParams<List<Boolean>> testListBoolean(@RequestBody RequestParams<List<Boolean>> req) {
        return null;
    }

    /**
     * @eo.name testListString
     * @eo.url /testListString
     * @eo.method post
     * @eo.request-type json
     * @param req
     * @return ResponseParams
     */
    @PostMapping("/testListString")
    public ResponseParams<List<String>> testListString(@RequestBody RequestParams<List<String>> req) {
        return null;
    }

    /**
     * @eo.name testListInteger
     * @eo.url /testListInteger
     * @eo.method post
     * @eo.request-type json
     * @param req
     * @return ResponseParams
     */
    @PostMapping("/testListInteger")
    public ResponseParams<List<Integer>> testListInteger(@RequestBody RequestParams<List<Integer>> req) {
        return null;
    }

    /**
     * @eo.name testListLong
     * @eo.url /testListLong
     * @eo.method post
     * @eo.request-type json
     * @param req
     * @return ResponseParams
     */
    @PostMapping("/testListLong")
    public ResponseParams<List<Long>> testListLong(@RequestBody RequestParams<List<Long>> req) {
        return null;
    }

}
