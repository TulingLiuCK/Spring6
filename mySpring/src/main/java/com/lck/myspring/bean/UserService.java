package com.lck.myspring.bean;

/***
 #Create by LCK on 2022/10/29
 # 用法: 
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save(){
        userDao.insert();
    }
}
