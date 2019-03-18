package com.tiger.demo.learn.thread;

public class MyThread implements Runnable{

    public static int sum = 0;

    private Demo demo;

    @Override
    public void run() {

        demo.getNewInt();


    }

    public MyThread(Demo demo) {
        this.demo = demo;
    }
}
