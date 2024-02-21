//package com.mytest.springboot.controller.zhongjin;
//
//import com.ciccwm.irp.basedata.api.module.calendar.calendarinfo.dto.CalendarInfoDTO;
//import com.ciccwm.irp.basedata.api.module.calendar.calendarinfo.dto.NearestTradingDayQueryDTO;
//import com.ciccwm.irp.basedata.api.module.calendar.calendarinfo.remote.CalendarInfoRemoteURI;
//import com.ciccwm.irp.basedata.api.module.calendar.calendarinfo.remote.ICalendarInfoRemoteEndpoint;
//import com.ciccwm.irp.basedata.service.module.calendar.calendarinfo.converter.CalendarInfoDTOConverter;
//import com.ciccwm.irp.basedata.service.module.calendar.calendarinfo.domain.CalendarInfo;
//import com.ciccwm.irp.basedata.service.module.calendar.calendarinfo.service.CalendarInfoService;
//import com.ciccwm.irp.component.common.rpc.request.parameter.generic.SingleParameter;
//import com.ciccwm.irp.component.common.rpc.response.Response;
//import com.ciccwm.irp.component.service.rpc.BaseRemoteService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDate;
//
//@Slf4j
//@RestController
//@RequestMapping(CalendarInfoRemoteURI.MODEL_PATH_REMOTE)
//public class CalendarInfoRemoteServiceController extends BaseRemoteService<Long, CalendarInfoDTO, CalendarInfo, CalendarInfoDTOConverter, CalendarInfoService> implements ICalendarInfoRemoteEndpoint {
//
//    @Override
//    public Response<CalendarInfoDTO> findByKey(@RequestBody SingleParameter<LocalDate> parameter) {
//
//        try {
//
//            LocalDate theDate = parameter.getP1();
//            if (theDate == null) {
//                return Response.failure("缺少参数: theDate");
//            }
//
//            CalendarInfo aDO = super.service.findByKey(theDate);
//
//            CalendarInfoDTO dto = this.converter.do2dto(aDO);
//
//            return Response.success(dto);
//
//        } catch (Throwable t) {
//            log.error("BaseRemoteService.find-by-key", t);
//            return Response.error(t);
//        }
//    }
//
////    @Override
////    public Response<LocalDate> findNearestTradingDay(NearestTradingDayQueryDTO queryDTO) {
////
////        LocalDate theDate = super.service.findNearestTradingDay(queryDTO);
////
////        return Response.success(theDate);
////    }
//}
