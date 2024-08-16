package com.mytest.springboot.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.Min;

@Slf4j
@Configuration
public class XxlJobConfig {

    @Value("${xxl.job.executor.app-name}")
    private String executorAppName;

    @Value("${xxl.job.executor.log-path}")
    private String executorLogPath;

    @Value("${xxl.job.executor.log-retention-days}")
    private int executorLogRetentionDays;

    @Value("${xxl.job.admin.addresses}")
    private String adminAddresses;

    @Value("${xxl.job.accessToken}")
    private String accessToken;

    @Value("${server.port}")
    private int port;

    @Bean
    public XxlJobSpringExecutor xxlJobExecutor() {
        log.info(">>>>>>>>>>> xxl-job config init.");
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(adminAddresses);
        xxlJobSpringExecutor.setPort(port + 10000);
        xxlJobSpringExecutor.setAppname(executorAppName);
        xxlJobSpringExecutor.setAccessToken(accessToken);
        xxlJobSpringExecutor.setLogPath(executorLogPath);
        xxlJobSpringExecutor.setLogRetentionDays(executorLogRetentionDays);
        return xxlJobSpringExecutor;
    }
}
