package com.lck.spring6.facotry;

/***
 #Create by LCK on 2022/10/28
 # 用法: 工厂方法模式中，具体工厂角色
 */
public class GunFactory {
    public Gun get(){
        return new Gun();
    }
}
