package com.lck.spring6.facotry;

import org.springframework.beans.factory.FactoryBean;

/***
 #Create by LCK on 2022/10/28
 # 用法: 
 */
public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<Person> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
