package com.hui.mybatis.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hui.mybatis.pojo.Emp;
import com.hui.mybatis.utils.SqlSessionUtil;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpMapperTest extends TestCase {

    public void testSelectByPrimaryKey() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        PageHelper.startPage(1,4);
        List<Emp> emps = mapper.selectByExample(null);
        for (Emp emp : emps) {
            System.out.println(emp);
        }
        PageInfo<Emp> tPageInfo = new PageInfo<>(emps, 1);
        System.out.println(tPageInfo);
    }
}