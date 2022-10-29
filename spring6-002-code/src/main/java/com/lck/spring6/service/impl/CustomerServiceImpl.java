package com.lck.spring6.service.impl;

import com.lck.spring6.dao.UserDao;
import com.lck.spring6.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 #Create by LCK on 2022/10/27
 # 用法: 
 */
public class CustomerServiceImpl implements CustomerService {
    private Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private UserDao userDao;

    public CustomerServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.insert();
    }
}
