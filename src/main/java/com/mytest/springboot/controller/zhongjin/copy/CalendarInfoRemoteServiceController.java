package com.mytest.springboot.controller.zhongjin.copy;

import com.eolinker.platform.api.response.BaseResult;
import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.controller.zhongjin.constant.BaseUriConstant;
import com.mytest.springboot.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@Slf4j
@RestController
@RequestMapping(BaseUriConstant.BASE_PATH)
public class CalendarInfoRemoteServiceController extends BaseRemoteService<Long, UserDto, UserDto, MyDODTOConverter, MyBaseAdapter>
        implements ICalendarInfoRemoteEndpoint {

    @Override
    public BaseResult findByKey(String name) {
        return null;
    }

    @Override
    public PlainResult<LocalDate> findNearestTradingDay(Long id) {
        return null;
    }

}
