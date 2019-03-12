package com.tiger.demo.controller;

import com.tiger.demo.dao.UserDao;
import com.tiger.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/testCpu")
    public void testCpu(){
        while (true){

        }
    }

    @GetMapping("/query")
    public User query(@RequestParam("id") Integer id){
        User user = userDao.queryUser(id);
        return user;

    }
}
