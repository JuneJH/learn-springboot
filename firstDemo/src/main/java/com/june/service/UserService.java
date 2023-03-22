package com.june.service;

import com.june.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private User user;

    @Autowired
    public void setUser(User user) {
        this.user = user;
    }

    public User getUser(){
        return user;
    }


}
