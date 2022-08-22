package com.hui.mybatis.mapper;

import com.hui.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    /*根据id查询用户信息*/
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /*根据id查询用户的信息所属部门*/
    Emp getEmpAndDeptById(@Param("empId") Integer empId);

    /*
    * 通过分步查询查询员工信息
    * */
    Emp getEmpByStep(@Param("empId") Integer empId);

    /*
    * 通过分布查询查询部门以及部门中的员工信息第二步
    * */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);

}
