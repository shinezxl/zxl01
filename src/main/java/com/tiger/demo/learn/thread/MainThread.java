package com.tiger.demo.learn.thread;

public class MainThread {
    public static void main(String[] args) {
        Demo demo = new Demo();
        for (int i = 0; i < 1000; i++) {
            new Thread(new MyThread(demo)).start();
        }
    }
}
