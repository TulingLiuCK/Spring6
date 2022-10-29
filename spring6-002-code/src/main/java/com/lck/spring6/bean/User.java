package com.lck.spring6.bean;

/***
 #Create by LCK on 2022/10/27
 # 用法: 这是一个Bean，封装了用户信息，Spring可以帮助我们创建User对象吗
 */
public class User {

    //Spring如何实例化对象
    //默认情况Spring会通过反射机制，调用类的无参数构造方法来实例化
    public User() {
        System.out.println("无参构造方法执行了");
    }
}
