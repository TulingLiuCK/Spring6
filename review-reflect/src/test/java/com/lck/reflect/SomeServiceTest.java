package com.lck.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    @Test
    public void test(){
        SomeService sodo = new SomeService();
        sodo.doSome();
        String s1 = sodo.doSome("哈哈");
        System.out.println(s1);
        String s2 = sodo.doSome("你好", "世界");
        System.out.println(s2);
    }
    @Test
    public void test2() throws Exception{
        //获取类
        Class<?> aClass = Class.forName("com.lck.reflect.SomeService");
        //获取方法
        Method doSome = aClass.getDeclaredMethod("doSome", String.class, String.class);
        //调用方法
        Object invoke = doSome.invoke(aClass.newInstance(), "哈哈哈", "世界");
        System.out.println(invoke);

    }
    @Test
    public void test3() throws Exception{
        Class<?> clazz = Class.forName("com.lck.reflect.SomeService");
        Method doSome = clazz.getDeclaredMethod("doSome");
        Object result = doSome.invoke(clazz.newInstance());


    }

}