package com.tiger.demo.util.RedisUtil;

import redis.clients.jedis.Jedis;

import java.util.UUID;

public class RedisLock {

    private static Jedis jedis;

    public static String getLock(String lockKey,int expireSeconds){

        try {
            jedis = RedisManagement.getJedis();
            String value = UUID.randomUUID().toString();
            Long setnx = jedis.setnx(lockKey, value);//1获取成功 0获取失败
            if (setnx==1){
                jedis.expire(lockKey,expireSeconds);
                return value;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
        return null;
    }

    public static boolean releaseLock(String key,String value) {
        try {
            jedis = RedisManagement.getJedis();
            Long ttl = jedis.ttl(key);
            System.out.println("ttl:"+ttl);
            if (jedis.get(key).equals(value)){
                Long del = jedis.del(key);//删除成功 1
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
