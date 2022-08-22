package com.hui.mybatis.mapper;

import com.hui.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SpecialSQLMapper {
    List<User> getUserByLike(@Param("username") String username);

    /*
    * 批量删除
    * */
    int deleteMore(@Param("ids") String ids);

    /*
    * 动态设置表名
    * */
    @MapKey("bookID")
    Map<String,Object> getAllUser(@Param("tableName") String tableName);

    /*
    * 添加用户信息
    *  useGeneratedKeys：设置使用自增的主键
     * keyProperty：因为增删改有统一的返回值是受影响的行数，因此只能将获取的自增的主键放在传输的参数user对象的某个属性中
    * */
    void insertUser(User user);


}
