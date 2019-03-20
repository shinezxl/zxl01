package com.tiger.demo.util.RedisUtil;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class RedisMain {

    private static final String LOCK_KEY = "test";

    public static void main(String[] args) {

        /*String value = RedisLock.getLock(LOCK_KEY, 10);
        System.out.println(value);
        try {
            Thread.sleep(1000*3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean test = RedisLock.releaseLock("test", value);*/

        //测试连接池数量8,jedis记得要close，不然连接超时
        /*for (int i = 0; i < 100; i++) {

            RedisLock.getLock(LOCK_KEY+i, 0);
            System.out.println("i:"+i);
        }*/


    }
}
