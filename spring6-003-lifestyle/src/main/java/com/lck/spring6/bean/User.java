package com.lck.spring6.bean;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/***
 #Create by LCK on 2022/10/28
 # 用法: Bean的生命周期按照五步
 */
@Data
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, DisposableBean {

    private String name;



    private Logger logger = LoggerFactory.getLogger(User.class);
    public User() {
        logger.info("第一步，无参数构造方法执行");
    }


    public void setName(String name) {
        logger.info("第二步，给对象属性赋值");
        this.name = name;
    }


    public void initBean(){
        logger.info("第三步，初始化Bean");
    }

    public void destroyBean(){
        logger.info("第五步，销毁Bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        logger.info("Bean的累加载器:{}",classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("生产Bean的工厂对象:{}",beanFactory);
    }

    @Override
    public void setBeanName(String s) {
//        System.out.println("Bean Name"+s);
        logger.info("Bean名字为：{}",s);
    }

    @Override
    public void destroy() throws Exception {
        logger.info("DisposableBean在销毁前执行");
    }
}
