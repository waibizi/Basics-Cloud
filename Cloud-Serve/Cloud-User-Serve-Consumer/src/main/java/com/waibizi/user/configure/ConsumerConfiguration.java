package com.waibizi.user.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 歪鼻子
 * @CreateDate: 2021/1/30
 * @Description:
 * @Version: 1.0.0
 **/
@Configuration
public class ConsumerConfiguration {

    /**
     * Bean 注解可以向spring容器当中注册RestTemplate,
     * LoadBalanced 注解可以让RestTemplate具备负载均衡功能
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
