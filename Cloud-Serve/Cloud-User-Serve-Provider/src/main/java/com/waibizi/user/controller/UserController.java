package com.waibizi.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 歪鼻子
 * @CreateDate: 2021/1/30
 * @Description:
 * @Version: 1.0.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") String id){
        return "getUser"+id;
    }
}
