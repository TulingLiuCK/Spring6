package com.lck.spring6.DItest;

import com.lck.spring6.service.impl.CustomerServiceImpl;
import com.lck.spring6.service.impl.userServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2022/10/27
 # 用法: 
 */
public class DiTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springDI.xml");
        userServiceImpl userService = (userServiceImpl) cpa.getBean("userService");
        userService.saveUser();
    }
    @Test
    public void test2(){
        BeanFactory bf = new ClassPathXmlApplicationContext("springDI.xml");
        CustomerServiceImpl cus = bf.getBean("customerService", CustomerServiceImpl.class);
        cus.save();

    }
}
