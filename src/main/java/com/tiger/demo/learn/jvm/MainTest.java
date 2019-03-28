package com.tiger.demo.learn.jvm;

import com.tiger.demo.domain.User;

public class MainTest {

    public static void main(String[] args) {

        System.out.println(User.class.getClassLoader());
        System.out.println(User.class.getClassLoader().getParent());
        System.out.println(User.class.getClassLoader().getParent().getParent());


    }
    /**
     * cpu升高
     */
    public static void cpu(){
        while (true){

        }
    }

    public static void memory(){
        String aa = "testfasdfasdfa";
        for (int i = 0; i < 10000; i++) {
            String string = new String(aa + i);
//            System.out.println(string);
        }
    }

    public static void stack(){
        stack();
    }
}
