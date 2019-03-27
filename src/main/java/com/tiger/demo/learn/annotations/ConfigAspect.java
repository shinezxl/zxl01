package com.tiger.demo.learn.annotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class ConfigAspect {
    @Pointcut("@annotation(com.tiger.demo.learn.annotations.MyAnnotation)")
    public void myAnnotation() {

    }


    @Before("myAnnotation()&& @annotation(myAnnotation1)")
    public void logStart(JoinPoint joinpoint,MyAnnotation myAnnotation1){
        System.out.println("myAnnotation.value:"+myAnnotation1.value());
        System.out.println("------"+joinpoint.getSignature().getName()+" start");
        System.out.println("------"+"请求参数："+ Arrays.asList(joinpoint.getArgs()));

    }

    @After("myAnnotation()")
    public void logEnd(JoinPoint joinpoint){
        System.out.println("------"+joinpoint.getSignature().getName()+" end");
    }

    @AfterReturning(value = "myAnnotation()",returning = "result")
    public void logReturn(Object result){
        System.out.println("------返回参数："+result);
    }

    @AfterThrowing(value = "myAnnotation()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("------运行异常 异常信息："+exception.getMessage());
    }




}
