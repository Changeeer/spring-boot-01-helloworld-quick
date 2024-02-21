//package com.mytest.springboot.controller.zhongjin;
//
//import com.ciccwm.irp.basedata.api.module.calendar.calendarinfo.dto.CalendarInfoDTO;
//import com.ciccwm.irp.basedata.api.module.calendar.calendarinfo.dto.NearestTradingDayQueryDTO;
//import com.ciccwm.irp.component.common.rpc.request.BuildinURI;
//import com.ciccwm.irp.component.common.rpc.request.parameter.generic.SingleParameter;
//import com.ciccwm.irp.component.common.rpc.response.Response;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.time.LocalDate;
//
//public interface ICalendarInfoRemoteEndpoint {
//
//    /**
//     * 根据业务主键查询数据
//     */
//    @PostMapping(BuildinURI.BASE + BuildinURI.FIND_BY_KEY)
//    Response<CalendarInfoDTO> findByKey(SingleParameter<LocalDate> parameter);
//
////    @PostMapping(CalendarInfoRemoteURI.FIND_NEAREST_TRADINGDAY)
////    Response<LocalDate> findNearestTradingDay(NearestTradingDayQueryDTO queryDTO);
//}
