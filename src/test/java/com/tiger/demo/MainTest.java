package com.tiger.demo;

import com.tiger.demo.domain.Testfanshen;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {

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
