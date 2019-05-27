package com.tiger.demo.learn.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
   /* @Autowired
    MqProduct mqProduct;
    @GetMapping("/testMq")
    public String testMq(){
        mqProduct.send();
        return "succeed";
    }

    @GetMapping("/testMqMany")
    public String testMqMany(){
        mqProduct.sendMany();
        return "succeed";
    }*/

   /* @GetMapping("/testMqManyThread")
    public String testMqManyThread(){
        mqProduct.sendManyThread();
        return "succeed";
    }*/
}
