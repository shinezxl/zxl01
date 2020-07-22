package com.tiger.demo.learn.aopannotation.aop.controller;


import com.tiger.demo.learn.aopannotation.aop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Key;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxl
 * @since 2019-05-23
 */
@RestController
@RequestMapping("/aop/user")
public class UserController {
    @Autowired
    IUserService iUserService;

    @GetMapping("/test")
    public synchronized String test(@RequestParam(value = "key",required = false) String key){
        iUserService.test(key);
        return "success";
    }

    @GetMapping("/test2")
    public String test2(@RequestParam(value = "key",required = false) String key){
        iUserService.test2(key);
        return "success";
    }

    @GetMapping("/test3")
    public String test3(@RequestParam(value = "key",required = false) String key){
        iUserService.test3(key);
        return "success";
    }

}

