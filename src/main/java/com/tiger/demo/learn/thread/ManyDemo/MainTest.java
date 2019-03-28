package com.tiger.demo.learn.thread.ManyDemo;

public class MainTest {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Thread thread=new Thread(){
                @Override
                public void run() {
                    synchronized (MainTest.class){
                        Constant.threadNum--;
                    }
                    while (Constant.threadNum>0){

                    }
                    synchronized (MainTest.class){
                        Constant.countNum++;
                        System.out.println(Constant.countNum);
                    }
                    /*Constant.countNum++;
                    System.out.println(Constant.countNum);*/


                }
            };
            thread.start();

        }
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("countNum最后的值为"+Constant.countNum);
        System.out.println("threadNum最后的值为"+Constant.threadNum);


    }
}
