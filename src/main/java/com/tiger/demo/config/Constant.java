package com.tiger.demo.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Constant {

    public volatile static int visitNum = 0;

    public static Map<Integer,Object> testMap = new ConcurrentHashMap();

}
