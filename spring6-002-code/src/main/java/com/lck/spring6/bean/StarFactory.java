package com.lck.spring6.bean;

/***
 #Create by LCK on 2022/10/28
 # 用法: 
 */
public class StarFactory {


    //工厂类只有一个静态方法
    //简单工厂模式叫做，静态工厂方法模式
    public static Star get(){
        //这个Star对象最终实际上创建的是还是我们负责new
        return new Star();
    }
}
