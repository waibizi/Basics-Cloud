package com.waibizi.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: 歪鼻子
 * @CreateDate: 2021/1/30
 * @Description:
 * @Version: 1.0.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class,args);
    }
}
