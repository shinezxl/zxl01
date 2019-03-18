package com.tiger.demo.learn.thread;

public class Demo {

    public static int aa = 0;
    public int getNewInt(){
        synchronized (Demo.class){
            System.out.println("----------");
            aa ++;
            System.out.println(aa);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("----------");
        }
        return aa;
    }


}
