package com.hui.proxy;

import com.hui.spring.proxy.Calculator;
import com.hui.spring.proxy.CalculatorImpl;
import com.hui.spring.proxy.ProxyFactory;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void testProxy(){
        //CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        //proxy.add(1,2);

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,2);
    }
}
