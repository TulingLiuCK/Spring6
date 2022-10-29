package com.lck.spring6.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/***
 #Create by LCK on 2022/10/28
 # 用法: 日志后置胡处理器
 */
public class LogBeanPostProcessor implements BeanPostProcessor {
    private Logger logger = LoggerFactory.getLogger(LogBeanPostProcessor.class);
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("Bean后置处理器的Before方法,{},bean:{}",beanName,bean);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    /**
     *  方法有两参数
     *  第一个参数创建的bean对下给你
     *  第二个参数：bean的名字
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("Bean后置处理器的After方法,{},bean:{}",beanName,bean);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
