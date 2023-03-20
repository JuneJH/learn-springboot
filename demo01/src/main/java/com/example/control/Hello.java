package com.example.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/h1")
    public String h1(){
        return  "Hello springboot";
    }
}
