package com.mytest.springboot.controller.zhongjin.copy;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.controller.zhongjin.constant.BaseUriConstant;
import com.mytest.springboot.controller.zhongjin.dto.DoubleParameter;
import com.mytest.springboot.dto.BaseRequest;
import com.mytest.springboot.dto.PageQuery;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IBaseRemoteClient<PKT, DTO> {

    @PostMapping(BaseUriConstant.BASE_URI + BaseUriConstant.URI_FIND_BY_ID)
    PlainResult<DTO> findById(@RequestBody BaseRequest<PKT> parameter);

    @PostMapping(BaseUriConstant.BASE_URI + BaseUriConstant.URI_COUNT_EXAMPLE)
    PlainResult<Long> countByExample(@RequestBody DTO dto);

    @PostMapping(BaseUriConstant.BASE_URI + BaseUriConstant.URI_LIST_EXAMPLE)
    PlainResult<List<DTO>> listByExample(@RequestBody DTO dto);

    @PostMapping(BaseUriConstant.BASE_URI + BaseUriConstant.URI_PAGE)
    PlainResult<Page<DTO>> page(@RequestBody PageQuery pageQuery);

    @PostMapping(BaseUriConstant.BASE_URI + BaseUriConstant.URI_PAGE_EXAMPLE)
    PlainResult<Page<DTO>> pageByExample(@RequestBody DoubleParameter<DTO, PageQuery> parameter);
}
