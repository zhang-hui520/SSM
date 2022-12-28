package com.hui.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoggerAspect {



/*
* 1、在切面中，需要通过指定的注解将方法标识为通知方法
* @Before:前置通知，在目标对象方法执行之前执行
* @After:后置通知，在目标对象方法的finally字句中执行
* @AfterReturning:返回通知，在目标对象方法返回值之后执行
*
* */



    public void beforeAdviceMethod(JoinPoint joinPoint){
        //获取连接点所对应方法的签名信息
        Signature signature = joinPoint.getSignature();
        
        //获取连接点所对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect,前置通知,方法："+signature.getName()+"参数："+ Arrays.toString(args));
    }


    public void afterAdviceMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,后置通知，方法："+signature.getName()+"方法执行完毕");
    }



    public void afterReturningAdviceMethod(JoinPoint joinPoint,Object result){
        //获取连接点所对应方法的签名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,返回通知,方法："+signature.getName()+"返回结果；"+result);
    }


    public void afterThrowingAdviceMethod(JoinPoint joinPoint, Throwable ex){
        //获取连接点所对应方法的签名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect，异常通知,方法："+signature.getName()+"异常；"+ex);
    }


    //环绕通知的方法返回值一定要和目标对象方法的返回值一致
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            //表示目标对象方法的执行
            System.out.println("环绕通知-->前置通知");
            result = joinPoint.proceed();
            System.out.println("环绕通知-->返回通知");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知-->异常通知");
        }finally {
            System.out.println("环绕通知-->后置通知");
        }
        return result;
    }
}
