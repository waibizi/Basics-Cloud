package com.waibizi.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: 歪鼻子
 * @CreateDate: 2021/1/30
 * @Description:
 * @Version: 1.0.0
 **/
@FeignClient(name = "user-serve-provider")
public interface UserService {

    /**
     * 调用用户服务提供方的user接口
     * @param id 用户的id
     * @return
     */
    @GetMapping("/user-provider/user/{id}")
    String getUser(@PathVariable("id") String id);
}
