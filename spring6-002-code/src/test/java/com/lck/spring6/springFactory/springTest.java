package com.lck.spring6.springFactory;

import com.lck.spring6.bean.Star;
import com.lck.spring6.facotry.Gun;
import com.lck.spring6.facotry.GunFactory;
import com.lck.spring6.facotry.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2022/10/28
 # 用法: 
 */
public class springTest {
    @Test
    public void test(){
        BeanFactory bean = new ClassPathXmlApplicationContext("spring-factory.xml");
        Star star = bean.getBean("star", Star.class);
        System.out.println(star);
    }
    @Test
    public void test1(){
        BeanFactory bean = new ClassPathXmlApplicationContext("spring-factory.xml");
        Gun gun = bean.getBean("gun", Gun.class);
        System.out.println(gun);
    }
    @Test
    public void test2(){
        BeanFactory bean = new ClassPathXmlApplicationContext("spring-factory.xml");
        Person person = bean.getBean("person", Person.class);
//        Person person1 = bean.getBean("person", Person.class);
//        System.out.println(person==person1);
        System.out.println(person);
    }
}
