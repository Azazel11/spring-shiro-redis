package com.example.springshiroredis.mapper;

import com.example.springshiroredis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select password from t_user where name=#{name}")
    String findPass(String username);
    @Select("select * from t_user where name=#{name}")
    User getUserByUsername(String username);

}
