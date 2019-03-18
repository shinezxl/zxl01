package com.tiger.demo.util.RedisUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.List;
import java.util.UUID;

public class RedisLock {


    /*public static String getLock(String lockKey,int expireSeconds){
        Jedis jedis = null;
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
        Jedis jedis = null;
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
    }*/



    /**
     * https://www.cnblogs.com/liuyang0/p/6744076.html
     * 加锁
     * @param locaName  锁的key
     * @param acquireTimeout  获取超时时间
     * @param timeout   锁的超时时间
     * @return 锁标识
     */
    public String getLock(String locaName,long acquireTimeout, long timeout) {
        Jedis jedis = null;
        String lockValue = null;
        try {
            // 获取连接
            jedis = RedisManagement.getJedis();
//            jedis = jedisPool.getResource();
            // 随机生成一个value
            String identifier = UUID.randomUUID().toString();
            // 锁名，即key值
            // 超时时间，上锁后超过此时间则自动释放锁
            int lockExpire = (int)(timeout / 1000);

            // 获取锁的超时时间，超过这个时间则放弃获取锁
            long end = System.currentTimeMillis() + acquireTimeout;
            while (System.currentTimeMillis() < end) {
                if (jedis.setnx(locaName, identifier) == 1) {
                    jedis.expire(locaName, lockExpire);
                    // 返回value值，用于释放锁时间确认
                    lockValue = identifier;
                    return lockValue;
                }
                // 返回-1代表key没有设置超时时间，为key设置一个超时时间
                if (jedis.ttl(locaName) == -1) {
                    jedis.expire(locaName, lockExpire);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return lockValue;
    }

    /**
     * 释放锁
     * @param lockName 锁的key
     * @param lockValue 释放锁的标识
     * @return
     */
    public boolean releaseLock(String lockName, String lockValue) {
        Jedis jedis = null;
        boolean retFlag = false;
        try {
            jedis = RedisManagement.getJedis();
            while (true) {
                // 监视lock，准备开始事务
                jedis.watch(lockName);
                // 通过前面返回的value值判断是不是该锁，若是该锁，则删除，释放锁
                if (lockValue.equals(jedis.get(lockName))) {
                    Transaction transaction = jedis.multi();
                    transaction.del(lockName);
                    List<Object> results = transaction.exec();
                    if (results == null) {
                        continue;
                    }
                    retFlag = true;
                }
                jedis.unwatch();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return retFlag;
    }
}
