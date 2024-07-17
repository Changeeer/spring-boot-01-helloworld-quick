package com.mytest.springboot.task;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyTask {

    @XxlJob("HW")
    public void HW() {
        String arg = XxlJobHelper.getJobParam();
        log.info("Hello World! {}", arg);
    }
}
