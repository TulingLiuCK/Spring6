package com.lck.myspring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 #Create by LCK on 2022/10/29
 # 用法: 
 */
public class UserDao {
    private Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void insert(){
        logger.info("mysql数据库保存用户信息");
    }
}
