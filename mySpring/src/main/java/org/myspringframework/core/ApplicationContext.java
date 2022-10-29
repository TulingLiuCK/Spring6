package org.myspringframework.core;

/***
 #Create by LCK on 2022/10/29
 # 用法: 
 */
public interface ApplicationContext {


    /**
     * 根据bean的名称获取对应的bean名称
     * @param beanName myspring配置文件中bena标签的id
     * @return
     */
    Object getBean(String beanName);


}
