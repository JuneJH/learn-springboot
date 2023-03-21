package com.june.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

    @GetMapping("h1")
    public String h1(){
        return "hello springboot";
    }
}
