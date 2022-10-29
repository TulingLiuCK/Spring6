package com.lck.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    /**
     *  需求，假设已知一下信息
     *  1类名叫做User
     *  2这个类符合javabena规范，属性私有化
     *  3属性叫做age
     *  4并且还知道age类型为int
     *  请使用反射机制调用相关方法
     */
    @Test
    public void test() throws Exception{
        Class<?> clazz = Class.forName("com.lck.reflect.User");
        Method setAge = clazz.getDeclaredMethod("setAge", int.class);
        Object obj = clazz.newInstance();
        Object result = setAge.invoke(obj, 111);
        Field filed = clazz.getDeclaredField("age");
        System.out.println(filed.getType());
        System.out.println(obj);

        Method getAge = clazz.getDeclaredMethod("getAge");
        Object result1 = getAge.invoke(obj);
        System.out.println(result1);


    }
}