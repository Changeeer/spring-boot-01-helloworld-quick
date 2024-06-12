package com.mytest.springboot.controller.structure;

import com.mytest.springboot.common.RequestParams;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.controller.BaseController;
import com.mytest.springboot.dto.Address;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.PageQuery;
import com.mytest.springboot.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

/**
 * @eo.api-type http
 * @eo.group-name 数据结构测试
 * @eo.path /structure
 * @eo.group-name 默认分组
 */

@RestController
@RequestMapping("/structure")
public class StructureUploadController
        extends BaseController<PageQuery, Address>
{

    /**
     * @eo.name get请求3个普通类型入参测试
     * @eo.url /get-data
     * @eo.method get
     * @eo.request-type formdata
     * @param id
     * @param token
     * @param getAllDetail
     * @return String
     */
    @GetMapping("/get-data")
    public String rawResp(@RequestParam(name = "uuid") Long id, String token, boolean getAllDetail) {
        return null;
    }

    /**
     * @eo.name post-json-req[list[user]]-resp[normal]测试
     * @eo.url /post-json-reqListUser-respNormal
     * @eo.method post
     * @return ResponseParams
     * @eo.request-type json
     * @param req
     */
    @PostMapping("/post-data-normalvo")
    public ResponseParams<NormalVO> getNormalByUser(
            @RequestBody RequestParams<List<UserDto>> req
    ) {
        return null;
    }

    /**
     * @eo.name post-json-req[list[list[string]]]-resp[list[list[normal]]]测试
     * @eo.url /post-json-reqListListString-respListListNormal
     * @eo.method post
     * @eo.request-type json
     * @param req
     * @return ResponseParams
     */
    @PostMapping("/post-data-list-list")
    public ResponseParams<List<List<NormalVO>>> getListList(
            @RequestBody RequestParams<List<List<String>>> req
    ) {
        return null;
    }

    /**
     * @eo.name post-fd-req[list[address]]_id_req[address]_req[list[resp[list[pageQuery]]]]-resp[address]测试
     * @eo.url /post-fd-reqListAddress-id-reqAddress-reqListRespListPageQuery-respAddress
     * @eo.method post
     * @eo.request-type formdata
     * @param reqListReqList
     * @return ResponseParams
     */
    @PostMapping("/post-data-address")
    public ResponseParams<Address> getAddress(
            RequestParams<List<Address>> reqList,
            String id,
            RequestParams<Address> req,
            RequestParams<List<ResponseParams<List<PageQuery>>>> reqListReqList
    ) {
        return null;
    }

    /**
     * @eo.name post-json-req[resp[pageQuery]]-resp[req[pageQuery]]测试
     * @eo.url /post-json-reqRespPageQuery-respReqPageQuery
     * @eo.method post
     * @eo.request-type json
     * @param req
     * @return ResponseParams
     */
    @PostMapping("/post-t-t")
    public ResponseParams<RequestParams<PageQuery>> getTTT(
            @RequestBody RequestParams<ResponseParams<PageQuery>> req
    ) {
        return null;
    }


    /**
     * @eo.name get-map[string_normal]-list[list[string]]测试
     * @eo.url /get-mapStringNormal-listListString
     * @eo.method get
     * @eo.request-type formdata
     * @param req
     * @return List
     */
    @GetMapping("/list-map-data")
    public List<List<String>> listMapApi(Map<String, NormalVO> req) {
        return null;
    }
}
