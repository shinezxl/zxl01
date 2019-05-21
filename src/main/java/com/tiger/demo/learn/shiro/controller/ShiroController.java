package com.tiger.demo.learn.shiro.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shiro")
public class ShiroController {

    @GetMapping("/test")
    public String test1(){
        System.out.println("--------------test start---------------");
        return "success";
    }

    @GetMapping("/query")
    @RequiresPermissions("web:books:list")
    public String query(){
        System.out.println("--------------query start---------------");
        return "success";
    }

    @GetMapping("/update")
    @RequiresPermissions("web:books:update")
    public String update(){
        System.out.println("--------------update start---------------");
        return "success";
    }

    @GetMapping("/delete")
    @RequiresPermissions("web:books:delete")
    public String delete(){
        System.out.println("--------------delete start---------------");
        return "success";
    }
}
