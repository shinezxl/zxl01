package com.tiger.demo.learn.jvm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JvmController {
    /**
     * cpu升高
     */
    @GetMapping("/cpu")
    public void cpu(){
        while (true){

        }
    }

    @GetMapping("/memory")
    public void memory(){
        String aa = "testtesttesttest";
        for (int i = 0; i < 10000; i++) {
            String string = new String(aa + i);
        }
    }

    @GetMapping("/stack")
    public void stack(){
        stack();
    }



}
