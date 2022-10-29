package org.myspringframework.core;

import junit.framework.TestCase;
import org.junit.Test;

public class ClassPathXmlApplicationContextTest extends TestCase {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");

    }

}