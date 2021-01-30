package com.waibizi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: 歪鼻子
 * @CreateDate: 2021/1/31
 * @Description:
 * @Version: 1.0.0
 **/
@Component
@ConfigurationProperties(prefix = "cloud")
public class CloudConfig {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
