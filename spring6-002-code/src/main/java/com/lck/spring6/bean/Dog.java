package com.lck.spring6.bean;

import lombok.Data;

import java.util.Date;

/***
 #Create by LCK on 2022/10/27
 # 用法: 
 */
@Data
public class Dog {
    private String name;
    private String age;
    private Date birth;
}
