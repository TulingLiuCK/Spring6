package com.lck.spring6.bean;


import com.lck.spring6.dao.impl.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FirstSpringTest {
    Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);

    @Test
    public void testFirstSpringCode(){
        ApplicationContext cpa = new ClassPathXmlApplicationContext("spring.xml");
        User user = (User) cpa.getBean("user");
        System.out.println(user);
        UserDaoImpl userDao = cpa.getBean("userDao", UserDaoImpl.class);
        userDao.insert();
        System.out.println(userDao);
        Date nowTime = (Date) cpa.getBean("nowTime");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(nowTime);
        System.out.println(format);
    }

    @Test
    public void testXmlPath(){
        ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\ideaCode\\Spring6\\spring6-002-code\\src\\main\\resources\\spring.xml");
        Date noewTime = ac.getBean("nowTime", Date.class);
        System.out.println(noewTime);
    }
    @Test
    public void testBeginInitBean(){
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("spring.xml");
        User user = cpa.getBean("user", User.class);
        logger.info("user:{}",user);
    }
}