package com.lck.spring6.scopeTest;

import com.lck.spring6.bean.scope;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2022/10/27
 # 用法: 
 */
public class SpringBeanScoptTest {
    @Test
    public void test(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-scope.xml");
        scope scope = beanFactory.getBean("scope", scope.class);
        scope scope1 = beanFactory.getBean("scope", scope.class);
        System.out.println(scope1);
        System.out.println(scope);
        System.out.println(scope == scope1);
    }
}
