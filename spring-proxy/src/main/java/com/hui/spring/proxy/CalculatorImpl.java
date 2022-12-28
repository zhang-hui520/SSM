package com.hui.spring.proxy;

public class CalculatorImpl implements Calculator{
    @Override
    public int add(int i, int j) {
        int n = i+j;
        System.out.println("方法内部,"+n);
        return n;
    }

    @Override
    public int sub(int i, int j) {
        int n = i-j;
        System.out.println("方法内部,"+n);
        return n;
    }

    @Override
    public int mul(int i, int j) {
        int n = i*j;
        System.out.println("方法内部,"+n);
        return n;
    }

    @Override
    public int div(int i, int j) {
        int n = i/j;
        System.out.println("方法内部,"+n);
        return n;
    }
}
