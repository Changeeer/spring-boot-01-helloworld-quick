package com.mytest.springboot.aspect;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.core.util.IdUtil;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Order(1)
@Aspect
@Component
public class XxlJobAspect {

    @Pointcut("@annotation(com.xxl.job.core.handler.annotation.XxlJob)")
    public void pointCut() {
    }

    @Around("pointCut() && @annotation(xxlJob)")
    public Object doAround(ProceedingJoinPoint point, XxlJob xxlJob) {
        String traceId = IdUtil.simpleUUID();
        MDC.put("traceId", traceId);

        String jobName = xxlJob.value();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        log.info("task start running. job:{}, time:{}, args:{}", jobName, LocalDateTime.now(), XxlJobHelper.getJobParam());
        Object proceed;
        try {
            proceed = point.proceed();
        }catch (Throwable e) {
            log.error("task run error. job:{}", jobName, e);
            failure(e,traceId);
            return null;
        }
        stopWatch.stop();
        log.info("task run success. job:{}, time:{}", jobName, LocalDateTime.now(), XxlJobHelper.getJobParam());
        success(traceId);
        return proceed;
    }

    private void failure(Throwable e, String traceId) {
        XxlJobHelper.handleFail("traceId=" + traceId + ", <br> Exception=" + ExceptionUtils.getStackTrace(e));
        MDC.remove("traceId");
    }

    private void success(String traceId) {
        XxlJobHelper.handleSuccess("traceId=" + traceId);
        MDC.remove("traceId");
    }
}
