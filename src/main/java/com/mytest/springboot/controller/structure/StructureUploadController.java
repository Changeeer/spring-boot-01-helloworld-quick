package com.mytest.springboot.controller.structure;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.controller.BaseController;
import com.mytest.springboot.dto.Address;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.PageQuery;
import com.mytest.springboot.dto.UserDto;
import com.mytest.springboot.dto.swagger.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @eo.api-type http
 * @eo.group-name 数据结构测试
 * @eo.path /structure
 * @eo.groupName 默认分组
 */

@RestController
@RequestMapping("/structure")
public class StructureUploadController
//        extends BaseController<PageQuery, Address>
{

//    /**
//     * @eo.name get请求返回raw
//     * @eo.url /get-data
//     * @eo.method get
//     * @eo.request-type formdata
//     * @param id
//     * @param token
//     * @param getAllDetail
//     * @return String
//     */
//    @GetMapping("/get-data")
//    public String rawResp(Long id, String token, boolean getAllDetail) {
//        return null;
//    }
//
//    /**
//     * @eo.name post请求数据结构
//     * @eo.url /post-data
//     * @eo.method post
//     * @return ResponseParams
//     * @eo.request-type json
//     * @param req
//     */
//    @PostMapping("/post-data-normalvo")
//    public ResponseParams<NormalVO> getNormalByUser(
//            @RequestBody RequestParams<List<UserDto>> req
//    ) {
//        return null;
//    }
//
//    @PostMapping("/post-data-list-list")
//    public ResponseParams<List<List<NormalVO>>> getListList(
//            @RequestBody RequestParams<List<List<String>>> req
//    ) {
//        return null;
//    }

    @PostMapping("/post-data-address")
    public ResponseParams<Address> getAddress(
            @RequestBody RequestParams<List<Address>> reqList,
            String id,
            RequestParams<Address> req,
            RequestParams<List<RequestParams<List<PageQuery>>>> reqListReqList
    ) {
        return null;
    }
//
//    @PostMapping("/post-t-t")
//    public ResponseParams<RequestParams<PageQuery>> getTTT(
//            @RequestBody RequestParams<ResponseParams<PageQuery>> req
//    ) {
//        return null;
//    }

//
//    /**
//     * @eo.name listMapApi
//     * @eo.url /list-map-data
//     * @eo.method get
//     * @eo.request-type formdata
//     * @param req
//     * @return List
//     */
//    @GetMapping("/list-map-data")
//    public List<List<String>> listMapApi(Map<String, NormalVO> req) {
//        return null;
//    }
}
