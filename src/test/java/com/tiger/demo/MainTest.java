package com.tiger.demo;

import com.tiger.demo.domain.Testfanshen;
import com.tiger.demo.learn.emil.MailBean;
import com.tiger.demo.learn.emil.TestMail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
@RunWith(SpringRunner.class)
@SpringBootTest(classes={DemoApplication.class})// 指定启动类
public class MainTest{

    @Autowired
    TestMail testMail;

    public static boolean a =true;
    public static int i =0;
    @Test
    public void test1(){

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc.test2();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                a = false;
            }
        });
        thread1.start();
        thread2.start();




    }

    @Test
    public void test11(){
        MailBean mailBean = new MailBean("yxue@gfscold.com","主题","test");

        testMail.sendSimpleMail(mailBean);

    }

    public boolean oddNumber(int a){
        return (a&1)==1;
    }

    @Test
    public void test2(){
        Testfanshen testfanshen = new Testfanshen();
        testfanshen.setPrivateString("private");
        testfanshen.setPublicString("public");
        objToMap(testfanshen);
    }
    public Map objToMap(Object object){

        Map<String,Object> map = new HashMap<>();

        try {
            Class<?> aClass = object.getClass();

            //获取指定的字段信息
            Field aaa = aClass.getDeclaredField("privateString");
            aaa.setAccessible(true);
            aaa.getName();
            aaa.get(object);

            //获取全部字段，放到map中
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                String paramName = declaredField.getName();
                Object paramValue = declaredField.get(object);

                map.put(paramName,paramValue);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(map.toString());
        return null;
    }


}
