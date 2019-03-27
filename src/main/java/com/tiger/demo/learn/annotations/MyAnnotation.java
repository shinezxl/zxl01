package com.tiger.demo.learn.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE,ElementType.METHOD})
@Inherited
public @interface MyAnnotation {
    String value() default "haha";
}
