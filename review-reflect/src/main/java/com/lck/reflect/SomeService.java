package com.lck.reflect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 #Create by LCK on 2022/10/29
 # 用法: 
 */
public class SomeService {
        private Logger logger = LoggerFactory.getLogger(SomeService.class);
    public void doSome(){
        logger.info("public void doSome()执行");
    }

    public String doSome(String s){
        logger.info("public void doSome(String s)执行");
        return s;
    }

    public String doSome(String s1 , String s2){
        logger.info("public String doSome(String s1, String s2)执行");
        return s1+s2;
    }


}
