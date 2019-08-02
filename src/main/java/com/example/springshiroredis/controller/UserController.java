package com.example.springshiroredis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/userlist")
    @ResponseBody
    public String getUser(){
        return "user";
    }
}
