package com.tiger.demo.util.RedisUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisManagement {

    private static final String JEDIS_ERROR_MASSAGE = "获取Jedis资源失败!";
    private static JedisPool jedisPool;

    static {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // 设置最大连接数
        jedisPoolConfig.setMaxTotal(200);
        // 设置最大空闲数
        jedisPoolConfig.setMaxIdle(8);
        // 设置最大等待时间
        jedisPoolConfig.setMaxWaitMillis(1000 * 100);
        jedisPool = new JedisPool(jedisPoolConfig,"127.0.0.1",6379);
    }

    public static Jedis getJedis() throws Exception {
        if (jedisPool!=null){
            return jedisPool.getResource();
        }
        throw new Exception(JEDIS_ERROR_MASSAGE);

    }


}
