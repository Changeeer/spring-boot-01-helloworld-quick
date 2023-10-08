package com.mytest.springboot.controller.dw.bug0622;

import com.du.dto.HttpMessageResult;
import com.du.dto.PageRequest;
import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.controller.dw.bug0622.dto.ItemRequst;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import com.mytest.springboot.oth.dto.DWRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * @eo.api-type http
 * @eo.group-name 0625-1-1-1
 * @eo.path /dewu
 */

@Slf4j
@RestController
@RequestMapping("dewu")
public class DWTestController {


    /**
     * @eo.name testSameTypeParams
     * @url /same-type-params
     * @eo.method post
     * @eo.request-type json
     * @param request
     * @return PlainResult
     */
    @PostMapping("same-type-params")
    public PlainResult<DWRequest> testSameTypeParams(@RequestBody DWRequest request) {

        return null;
    }

//
//    /**
//     * @eo.name testMyClazz
//     * @eo.url /my-dto
//     * @eo.method post
//     * @eo.request-type formdata
//     * @param userDto
//     * @return PlainResult
//     */
//    @PostMapping("my-dto")
//    public PlainResult<String> testMyClazz(UserDto userDto) {
//        return null;
//    }


    /**
     * @eo.name delete
     * @url /item/delete
     * @eo.method post
     * @eo.request-type json
     * @param itemRequst
     * @return PageRequest
     */
    @PostMapping(value = "/item/delete")
    public PageRequest delete(@RequestBody ItemRequst itemRequst) {
        return null;
    }


    /**
     * @eo.name delete2
     * @eo.group-name 0525-2.test
     * @url /item/delete2
     * @eo.method post
     * @eo.request-type json
     * @param normal
     * @return HttpMessageResult
     */
    @RequestMapping(value = "/item/delete2", method = {RequestMethod.POST})
    public HttpMessageResult delete2(@RequestBody NormalVO normal) {
        return null;
    }
























}
