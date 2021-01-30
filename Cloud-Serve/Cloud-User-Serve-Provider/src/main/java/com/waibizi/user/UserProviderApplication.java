package com.waibizi.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: 歪鼻子
 * @CreateDate: 2021/1/30
 * @Description: 用户管理启动器
 * @Version: 1.0.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class UserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class,args);
    }
}
