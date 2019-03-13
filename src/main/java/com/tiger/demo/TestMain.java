package com.tiger.demo;

import com.tiger.demo.serviceimpl.TestServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {

        ApplicationContext aop = new ClassPathXmlApplicationContext("bean.xml");
        TestServiceImpl bean = aop.getBean(TestServiceImpl.class);
        Map map = new HashMap();
        map.put("name","able");
        map.put("age","26");
        map.put("sex","男");

        bean.getString1(map);
        bean.getString2();
    }
}
