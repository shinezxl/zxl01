package com.tiger.demo.util.RedisUtil;

public class RedisMain {

    public static void main(String[] args) {

        String value = RedisLock.getLock("test", 10);
        System.out.println(value);
        System.out.println(1111);
        try {
            Thread.sleep(1000*3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean test = RedisLock.releaseLock("test", value);
        System.out.println(test);

    }
}
