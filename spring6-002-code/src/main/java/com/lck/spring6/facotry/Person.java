package com.lck.spring6.facotry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

/***
 #Create by LCK on 2022/10/28
 # 用法: 
 */
public class Person implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware {
    private Logger logger = LoggerFactory.getLogger(Person.class);
    public Person() {
        System.out.println("Person无参构造方法");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        logger.info("classLoader:{}",classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("BeanFactory:{}",beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name"+s);
        logger.info("Bean名字为：{}",s);
    }
}
