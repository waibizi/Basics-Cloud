package com.waibizi.user.controller;

import com.waibizi.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 歪鼻子
 * @CreateDate: 2021/1/30
 * @Description:
 * @Version: 1.0.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("{id}")
    public String getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    }
}
