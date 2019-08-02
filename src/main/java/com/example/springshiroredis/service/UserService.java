package com.example.springshiroredis.service;

import com.example.springshiroredis.entity.User;

public interface UserService {
    String findPass(String username);
    User getUserByUsername(String username);

}
