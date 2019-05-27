package com.tiger.demo.learn.aopannotation.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//定义在类的属性上
@Retention(RetentionPolicy.RUNTIME)
public @interface NeedSetValue {
    Class<?> beanClass();

    String param();

    String method();

    String targetFiled();
}
