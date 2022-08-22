package com.hui.mybatis.mapper;

import com.hui.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface UserMapper {
    /*根据用户姓名查询用户信息*/
    User getUserByUsername(String username);
    /*根据用户名、密码验证登陆*/
    User checkLogin(String username,String passwors);

    User checkLoginByMap(Map<String , Object> map);

    /*添加用户信息*/
    void insertUser(User user);
    /*@Param*/
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
