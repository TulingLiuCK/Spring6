package com.lck.spring6.p;

import com.lck.spring6.bean.Dog;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2022/10/27
 # 用法: 
 */
public class Ptest {
    private Logger logger = LoggerFactory.getLogger(Ptest.class);
    @Test
    public void test(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dog = beanFactory.getBean("dog", Dog.class);
        System.out.println(dog);
        logger.info("dog:{}",dog);
    }
}
