package com.mytest.springboot.controller.zhongjin.copy;

import com.eolinker.platform.api.response.BaseResult;
import com.eolinker.platform.api.response.PlainResult;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

import static com.mytest.springboot.controller.zhongjin.constant.BaseUriConstant.*;

public interface ICalendarInfoRemoteEndpoint {

    /**
     * 根据业务主键查询数据
     */
    @PostMapping(BASE_URI + URI_FIND_BY_KEY)
    BaseResult findByKey(String name);

    @PostMapping(BASE_URI + URI_DAY)
    PlainResult<LocalDate> findNearestTradingDay(Long id);
}
