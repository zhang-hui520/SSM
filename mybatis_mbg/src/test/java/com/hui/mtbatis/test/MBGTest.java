package com.hui.mtbatis.test;

import com.hui.mybatis.mapper.DeptMapper;
import com.hui.mybatis.mapper.EmpMapper;
import com.hui.mybatis.pojo.Dept;
import com.hui.mybatis.pojo.Emp;
import com.hui.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MBGTest {
    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.selectByPrimaryKey(1);
        System.out.println(dept);
    }

}
