package com.tiger.demo.config;


import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

import java.util.Arrays;
//日志切面类
@Component("logAspects")
public class LogAspects {
    public void logStart(JoinPoint joinpoint){
        System.out.println("------"+joinpoint.getSignature().getName()+" start");
        System.out.println("------"+"请求参数："+ Arrays.asList(joinpoint.getArgs()));

    }

    public void logEnd(JoinPoint joinpoint){
        System.out.println("------"+joinpoint.getSignature().getName()+" end");
    }

    public void logReturn(Object result){
        System.out.println("------返回参数："+result);
    }

    public void logException(Exception exception){
        System.out.println("------运行异常 异常信息："+exception);
    }

}
