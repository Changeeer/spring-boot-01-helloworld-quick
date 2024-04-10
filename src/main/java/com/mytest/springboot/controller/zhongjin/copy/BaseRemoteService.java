package com.mytest.springboot.controller.zhongjin.copy;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.controller.zhongjin.constant.BaseUriConstant;
import com.mytest.springboot.controller.zhongjin.dto.DoubleParameter;
import com.mytest.springboot.dto.BaseRequest;
import com.mytest.springboot.dto.PageQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Slf4j
public class BaseRemoteService<PKT, DTO, DO, CONV extends IDODTOConverter<DO, DTO>, SRV extends BaseAdapter<PKT, ?, ?, DO, ?, ?, ?, ?>>
        implements IBaseRemoteClient<PKT, DTO> {

//    @Autowired
    protected SRV service;
//    @Autowired
    protected CONV converter;

    /**
     * 根据主键查询
     */
    @Override
    public PlainResult<DTO> findById(@RequestBody BaseRequest<PKT> parameter) {
        return null;
    }

    @PostMapping(BaseUriConstant.BASE_URI + BaseUriConstant.URI_COUNT)
    public PlainResult<Long> count() {
        return null;
    }


    @Override
    public PlainResult<Long> countByExample(@RequestBody DTO dto) {
        return null;
    }

    @PostMapping(BaseUriConstant.BASE_URI + BaseUriConstant.URI_LIST)
    public PlainResult<List<DTO>> list() {
        return null;
    }

    @Override
    public PlainResult<List<DTO>> listByExample(@RequestBody DTO dto) {
        return null;
    }

    /**
     * 分页
     */
    @Override
    public PlainResult<Page<DTO>> page(@RequestBody PageQuery pageQuery) {
        return null;
    }

    /**
     * 分页
     */
    @Override
    public PlainResult<Page<DTO>> pageByExample(@RequestBody DoubleParameter<DTO, PageQuery> parameter) {
        return null;
    }
}
