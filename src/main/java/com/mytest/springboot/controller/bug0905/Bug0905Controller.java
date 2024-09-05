package com.mytest.springboot.controller.bug0905;

import com.mytest.springboot.dto.BaseRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @eo.api-type http
 * @eo.group-name bug-0905
 * @eo.path /bug-0905
 */

@RestController
@RequestMapping("/bug-0905")
public class Bug0905Controller {

    @GetMapping("/springmvc-header/{day}/list")
    public BaseRequest springMVCHeader(@RequestHeader(value = "user_id", required = false) Long userId,
                                       @PathVariable String day,
                                       @RequestParam(value = "page", required = false) Integer page,
                                       String name) {
        return null;
    }
}
