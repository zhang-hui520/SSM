package com.hui.mybatis.mapper;

import com.hui.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /*
    * 分步查询的第二步：根据员工所对应的deptId查询部门信息
    * */
    Dept getEmpDeptByStep(@Param("deptId") Integer deptId);

    /*
    * 查询部门信息以及部门中员工的信息
    * */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);
    /*
    * 通过分布查询查询部门以及部门中的员工信息第一步
    * */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);


}
