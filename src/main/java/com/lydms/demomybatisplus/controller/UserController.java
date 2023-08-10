package com.lydms.demomybatisplus.controller;

import com.lydms.demomybatisplus.domain.User;
import com.lydms.demomybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    /**
     * 获取用户信息
     */
    @RequestMapping("/get")
    public List<User> create() {
        List<User> list = userService.list();
        return list;
    }
}
