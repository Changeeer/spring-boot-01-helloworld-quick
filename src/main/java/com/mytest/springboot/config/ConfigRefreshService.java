package com.mytest.springboot.config;

import lombok.Data;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Data
@Service
@RefreshScope
public class ConfigRefreshService {
    private XxlJobConfig xxlJobConfig;
}
