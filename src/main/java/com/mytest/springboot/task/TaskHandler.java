package com.mytest.springboot.task;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TaskHandler extends IJobHandler {

    @XxlJob("taskHandler")
    @Override
    public void execute() throws Exception {
        String arg = XxlJobHelper.getJobParam();
        log.info("task handler. arg:{}", arg);
    }
}
