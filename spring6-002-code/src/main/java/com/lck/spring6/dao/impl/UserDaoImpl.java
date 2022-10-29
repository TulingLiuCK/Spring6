package com.lck.spring6.dao.impl;

import com.lck.spring6.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 #Create by LCK on 2022/10/27
 # 用法: 
 */

public class UserDaoImpl implements UserDao {

    private Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public void insert() {
        logger.info("数据正在插入");
    }
}
