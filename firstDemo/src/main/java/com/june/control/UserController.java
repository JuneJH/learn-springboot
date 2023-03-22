package com.june.control;

import com.june.pojo.User;
import com.june.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private UserService user;

    // set 注入
    @Autowired
    public void  setUser(UserService list){
        this.user=list;
    }
    // 构造注入
    public UserController(UserService list){
        this.user=list;
    }

    @GetMapping("h1")
    public String h1(){
        return "hello springboot";
    }

    @GetMapping("/getUser")
    public User getUser(){
        return user.getUser();
    }
}
