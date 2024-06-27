package com.mytest.springboot.controller.xq0704;

import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.PageQuery;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @eo.api-type http
 * @eo.group-name xq-0704
 * @eo.path /xq-0704
 * @eo.tag H, G
 */

@RestController
@RequestMapping("/xq-0704")
public class XQ0704Controller {

    /**
     * @param query
     * @return ResponseParams
     * @eo.name 测试标签
     * @eo.tag A, B, C, D, E
     * @eo.url /test-tag
     * @eo.method post
     * @eo.request-type json
     */
    @PostMapping("/test-tag")
    public ResponseParams<Long> testTag(@RequestBody PageQuery query) {
        return null;
    }

    /**
     * @param query
     * @return ResponseParams
     * @eo.name 测试详细说明
     * @eo.description 这是一段又长又臭的详细说明
     * @eo.url /test-desc
     * @eo.method post
     * @eo.request-type json
     */
    @PostMapping("/test-eo-desc")
    public ResponseParams<String> testEoDesc(@RequestBody PageQuery query) {
        return null;
    }


    /**
     * @eo.tag 支付2
     * @param query
     * @return
     */
    @ApiOperation(value = "s2详细说明测试", notes = "这是一段又长又臭的详细说明，123熭34慌iuh'ii")
    @PostMapping("/test-s2-desc")
    public ResponseParams<String> testS2Desc(@RequestBody PageQuery query) {
        return null;
    }
}
