package com.tiger.demo.learn.aopannotation.aop.constant;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AopConstant {
    public  static Map<String,Object>  map = new HashMap<>();
    public  static Map<String,Object>  concurrentMap = new ConcurrentHashMap<>();


    public static boolean getLock(String key){

        return false;
    }
}
