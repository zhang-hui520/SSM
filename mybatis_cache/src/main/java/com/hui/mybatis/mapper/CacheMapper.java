package com.hui.mybatis.mapper;

import com.hui.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {

    /*
    * 根据员工id信息员工查询
    * */
    Emp getEmpById(@Param("empId") Integer empId);

}
