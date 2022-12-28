package com.hui.spring;

import com.hui.spring.controller.UserController;
import com.hui.spring.pojo.Clazz;
import com.hui.spring.pojo.Student;
import com.hui.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class IOCByXMLTest {

    @Test
    public void testIOC(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentOne", Student.class);
        System.out.println(student);

    }

    @Test
    public void testDI(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentFive = ioc.getBean("studentTwo", Student.class);
        System.out.println(studentFive);
    }

    @Test
    public void testDIList(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz clazzTwo = ioc.getBean("clazzTwo", Clazz.class);
        System.out.println(clazzTwo);
    }

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DataSource dataSource = ac.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }


    @Test
    public void testBeanScope(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-scope.xml");
        User user1 = ac.getBean(User.class);
        User user2 = ac.getBean(User.class);
        System.out.println(user1 == user2);
    }

    @Test
    public void testLife(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User bean = ac.getBean(User.class);
        System.out.println("生命周期：4、通过IOC容器获取bean并使用"+bean);
        ac.close();
    }

    @Test
    public void testFactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-factory.xml");
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
    }

    @Test
    public void testAutowire(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.saveUser();
    }
}
