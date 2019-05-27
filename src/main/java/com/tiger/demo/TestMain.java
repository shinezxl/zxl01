package com.tiger.demo;

import com.tiger.demo.domain.User;
import com.tiger.demo.serviceimpl.TestServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) throws Exception{

        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        thread.start();*/

       /* ApplicationContext aop = new ClassPathXmlApplicationContext("bean.xml");
        TestServiceImpl bean = aop.getBean(TestServiceImpl.class);
        Map map = new HashMap();
        map.put("name","able");
        map.put("age","26");
        map.put("sex","男");

        bean.getString1(map);
        bean.getString2();*/

       /*double a = 1;

       Double b = Double.valueOf(1);

       Double c = Double.valueOf(2);

       if (b>0){
           System.out.println(1);
       }*/

        System.out.println("---------start---------");
        Thread.sleep(1000*10);
        User user = new User();
        System.out.println(user.getUserName());

        System.out.println("---------end---------");

    }
}
