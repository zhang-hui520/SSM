package com.hui.spring.test;

import com.hui.spring.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Test
    public void testUpdate(){
        String sql = "insert into t_emp values(null,?,?,?,null)";
        int i = jdbcTemplate.update(sql, "张三", 23, "男");
        System.out.println(i);
    }

    @Test
    public void testSelectEmpById(){
        String sql = "select * from t_emp where emp_id = ?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 6);
        System.out.println(emp);
    }

    @Test
    //查询多条数据为一个list集合
    public void testSelectList() {
        String sql = "select * from t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        list.forEach(System.out::println);
    }

    @Test
    //查询单行单列的值
    public void selectCount(){
        String sql = "select count(emp_id) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}
