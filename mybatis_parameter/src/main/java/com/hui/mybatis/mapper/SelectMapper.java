package com.hui.mybatis.mapper;

import com.hui.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    User getUserById(@Param("id") Integer id);
    List<User> getUserAll();
    /*查询用户总数*/
    Integer getCount();

    /*查询所有用户返回list【map】*/

    //List<Map<String,Object>> getAllUserToMap();

    @MapKey("id")
    Map<String,Object> getAllUserToMap();

}
