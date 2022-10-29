package org.myspringframework.core;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 #Create by LCK on 2022/10/29
 # 用法: 
 */
public class ClassPathXmlApplicationContext implements ApplicationContext{

    private static Logger logger = LoggerFactory.getLogger(ClassPathXmlApplicationContext.class);

    private Map<String,Object> singletonObejcts = new HashMap<>();

    /**
     * 解析myspring的配置文件，然后初始化所有Bean对象
     * @param configLocation spring配置文件的路径 注意：使用ClassPathXmlApplicationContext,配置文件应该放到类路径下
     */
    public ClassPathXmlApplicationContext(String configLocation) {
        try {
            //解析myspring.xml文件，然后实例化Bean，将Bean存放到singletonObjects集合中
            //dom4j解析XML文件的核心对象
            SAXReader reader = new SAXReader();
            //获取一个输入流，指向配置文件
            InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
            //读文件 document就是文档
            Document document = reader.read(in);
            //获取所有bean标签
            List<Node> nodes = document.selectNodes("//bean");
            //遍历bean标签
            nodes.forEach(node -> {
//                System.out.println(node);
                //向下转型，为了使用Element更丰富的方法
                Element element = (Element) node;
                //获取id属性
                String id = element.attributeValue("id");
                logger.info("id为：{}",id);
                //获取class属性
                String className = element.attributeValue("class");
                logger.info("className：{}",className);
            });
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanName) {
        return null;
    }
}
