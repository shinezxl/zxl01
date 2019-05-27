package com.tiger.demo.learn.aopannotation.aspect;

import com.tiger.demo.learn.aopannotation.util.BeanUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Aspect
public class SetFiledValueAspect {
    @Autowired
    private BeanUtil beanUtil;

    @Around("@annotation(com.tiger.demo.learn.aopannotation.annotion.NeedSetFeildValue)")
    public Object doSetFeildValue(ProceedingJoinPoint pjp) throws Throwable{

        Object ret = pjp.proceed();
        if (ret instanceof Collection){
            // 对结果集进行处理
            this.beanUtil.setFieldValueForCollection((Collection) ret);

        }
//        this.beanUtil.setFieldValueForCollection1(ret);

        return ret;
    }
}
