package com.example.springshiroredis.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/user")
public class LoginController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @PostMapping("/login")
    public JSONObject login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        Subject subject = SecurityUtils.getSubject();
        JSONObject json = new JSONObject();
        Session session = subject.getSession();
        String sessionId = (String) session.getId();
        json.put("sessionId", sessionId);
        return json;
    }
}
