package com.tiger.demo.learn.annotations;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerTest {

    @MyAnnotation("logInfo")
    @RequestMapping("/logInfo")
    public void logInfo(){
        System.out.println("-------cry in the dream--------");
        int a =1/0;
        /*myAnnotation.value:logInfo
                ------logInfo start
        ------请求参数：[]
        -------cry in the dream--------
                ------logInfo end
        ------运行异常 异常信息：/ by zero*/
    }
}
