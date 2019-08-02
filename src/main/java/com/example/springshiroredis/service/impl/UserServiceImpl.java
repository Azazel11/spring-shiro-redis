package com.example.springshiroredis.service.impl;

import com.example.springshiroredis.entity.User;
import com.example.springshiroredis.mapper.UserMapper;
import com.example.springshiroredis.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public String findPass(String username){
        return userMapper.findPass(username);
    }

    public User getUserByUsername(String username){
        return userMapper.getUserByUsername(username);
    }
}
