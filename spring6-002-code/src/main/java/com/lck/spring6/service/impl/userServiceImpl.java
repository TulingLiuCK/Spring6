package com.lck.spring6.service.impl;

import com.lck.spring6.dao.UserDao;
import com.lck.spring6.service.userService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/***
 #Create by LCK on 2022/10/27
 # 用法: 
 */

public class userServiceImpl implements userService {

    private Logger logger = LoggerFactory.getLogger(userServiceImpl.class);

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.insert();
    }
}
