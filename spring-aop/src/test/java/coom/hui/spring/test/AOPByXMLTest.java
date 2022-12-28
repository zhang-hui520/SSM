package coom.hui.spring.test;

import com.hui.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPByXMLTest {

    @Test
    public void testAOPByXML(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        calculator.add(1,1);
    }
}
