package com.mytest.springboot.controller.xq0915;

import com.mytest.springboot.dto.BaseRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @eo.api-type http
 * @eo.group-name xq-0915
 * @eo.path /bug-0915
 */

@RestController
@RequestMapping("/xq-0915")
public class XQ0915Controller {

    @GetMapping("/{year}/{month}/{day}/list")
    public BaseRequest springMVCHeader(@PathVariable(required = false) String year,
                                       @PathVariable String month,
                                       @PathVariable String day,
                                       String keyword) {
        return null;
    }
}
