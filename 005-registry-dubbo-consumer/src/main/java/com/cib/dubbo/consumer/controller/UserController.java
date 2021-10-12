package com.cib.dubbo.consumer.controller;

import com.cib.dubbo.bean.User;
import com.cib.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(version = "1.0.0")
    UserService userService;

    @GetMapping("/user")
    public User findUserById(Integer id){
        User user = userService.findUserById(id);
        return user;
    }
}
