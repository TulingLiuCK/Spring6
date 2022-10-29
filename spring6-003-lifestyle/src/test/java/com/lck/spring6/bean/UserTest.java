package com.lck.spring6.bean;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private Logger logger = LoggerFactory.getLogger(UserTest.class);
    @Test
    public void test(){
        BeanFactory bean = new ClassPathXmlApplicationContext("spring.xml");
        User user = bean.getBean("user", User.class);
        logger.info("第四步，使用Bean,{}",user);

        //手动关闭Spring容器， 才会调用销毁方法
        ClassPathXmlApplicationContext cpa = (ClassPathXmlApplicationContext) bean;
        cpa.close();
    }

}