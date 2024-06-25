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
 * @eo.tags H, G
 */

@RestController
@RequestMapping("/xq-0704")
public class XQ0704Controller {

    /**
     * @param query
     * @return ResponseParams
     * @eo.name 测试标签
     * @eo.tags A, B, C, D, E
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
     * @eo.description 213u182u3217d973j7d37d3j8jd983d7983jd739cr73c72894c12h3c472h347ch927c49812734ch9824928374c892734c23412834u829u89u89c87by4734trc73y83y4rcy2938c1
     * @eo.url /test-desc
     * @eo.method post
     * @eo.request-type json
     */
    @PostMapping("/test-eo-desc")
    public ResponseParams<String> testEoDesc(@RequestBody PageQuery query) {
        return null;
    }


    @ApiOperation(value = "s2详细说明测试", notes = "跌U盾绘画出好的骄傲沉迷偶家度斤万千毫度斤第万第斤厘毫度斤千时第微度千万厘")
    @PostMapping("/test-s2-desc")
    public ResponseParams<String> testS2Desc(@RequestBody PageQuery query) {
        return null;
    }
}
