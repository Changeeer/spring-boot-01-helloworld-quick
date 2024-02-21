//package com.mytest.springboot.controller.zhongjin;
//
//import com.ciccwm.irp.component.common.page.Page;
//import com.ciccwm.irp.component.common.page.PageQuery;
//import com.ciccwm.irp.component.common.rpc.remote.IBaseRemoteClient;
//import com.ciccwm.irp.component.common.rpc.request.BuildinURI;
//import com.ciccwm.irp.component.common.rpc.request.parameter.IdQuitelyParameter;
//import com.ciccwm.irp.component.common.rpc.request.parameter.generic.DoubleParameter;
//import com.ciccwm.irp.component.common.rpc.response.Response;
//import com.ciccwm.irp.component.service.base.BaseAdapter;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.List;
//
//@Slf4j
//public class BaseRemoteService<PKT, DTO, DO, CONV extends IDODTOConverter<DO, DTO>, SRV extends BaseAdapter<PKT, ?, ?, DO, ?, ?, ?, ?>>
//        implements IBaseRemoteClient<PKT, DTO> {
//
//    @Autowired
//    protected SRV service;
//    @Autowired
//    protected CONV converter;
//
//    /**
//     * 根据主键查询
//     */
//    @Override
//    public Response<DTO> findById(@RequestBody IdQuitelyParameter<PKT> parameter) {
//
//        DO aDo;
//
//        try {
//
//            PKT id = parameter.getId();
//            Boolean quietly = parameter.getQuitely();
//
//            if (quietly == null) {
//
//                aDo = this.service.findById(id);
//
//            } else {
//
//                aDo = this.service.findById(id, quietly);
//            }
//
//            DTO dto = this.converter.do2dto(aDo);
//
//            return Response.success(dto);
//
//        } catch (Throwable t) {
//            log.error("BaseRemoteService.findById", t);
//            return Response.error(t);
//        }
//    }
//
//    @PostMapping(BuildinURI.BASE + BuildinURI.COUNT)
//    public Response<Long> count() {
//
//        try {
//
//            long count = this.service.count();
//
//            return Response.success(count);
//
//        } catch (Throwable t) {
//            log.error("BaseRemoteService.count", t);
//            return Response.error(t);
//        }
//    }
//
//    @Override
//    public Response<Long> countByExample(@RequestBody DTO dto) {
//
//        try {
//
//            DO aDo = this.converter.dto2do(dto);
//
//            long count = this.service.countByExample(aDo);
//
//            return Response.success(count);
//
//        } catch (Throwable t) {
//            log.error("BaseRemoteService.count-by-example", t);
//            return Response.error(t);
//        }
//    }
//
//
//
//    @PostMapping(BuildinURI.BASE + BuildinURI.LIST)
//    public Response<List<DTO>> list() {
//
//        try {
//
//            List<DO> doList = this.service.list();
//
//            List<DTO> dtoList = this.converter.do2dto(doList);
//
//            return Response.success(dtoList);
//
//        } catch (Throwable t) {
//            log.error("BaseRemoteService.list", t);
//            return Response.error(t);
//        }
//    }
//
//    @Override
//    public Response<List<DTO>> listByExample(@RequestBody DTO dto) {
//
//        try {
//
//            DO aDo = this.converter.dto2do(dto);
//
//            List<DO> doList = this.service.listByExample(aDo);
//
//            List<DTO> dtoList = this.converter.do2dto(doList);
//
//            return Response.success(dtoList);
//
//        } catch (Throwable t) {
//            log.error("BaseRemoteService.list-by-example", t);
//            return Response.error(t);
//        }
//    }
//
//    /**
//     * 分页
//     */
//    @Override
//    public Response<Page<DTO>> page(@RequestBody PageQuery pageQuery) {
//
//        try {
//
//            Page<DO> doPage = this.service.page(pageQuery);
//
//            Page<DTO> dtoPage = this.converter.do2dto(doPage);
//
//            return Response.success(dtoPage);
//
//        } catch (Throwable t) {
//            log.error("BaseRemoteService.page", t);
//            return Response.error(t);
//        }
//    }
//
//    /**
//     * 分页
//     */
//    @Override
//    public Response<Page<DTO>> pageByExample(@RequestBody DoubleParameter<DTO, PageQuery> parameter) {
//
//        try {
//
//            DTO dto = parameter.getP1();
//            PageQuery pageQuery = parameter.getP2();
//
//            DO aDo = this.converter.dto2do(dto);
//
//            Page<DO> doPage = this.service.page(aDo, pageQuery);
//
//            Page<DTO> dtoPage = this.converter.do2dto(doPage);
//
//            return Response.success(dtoPage);
//
//        } catch (Throwable t) {
//            log.error("BaseRemoteService.page-by-example", t);
//            return Response.error(t);
//        }
//    }
//}
