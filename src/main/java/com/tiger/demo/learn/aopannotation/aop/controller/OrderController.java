package com.tiger.demo.learn.aopannotation.aop.controller;


import com.tiger.demo.learn.aopannotation.aop.entity.Order;
import com.tiger.demo.learn.aopannotation.aop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxl
 * @since 2019-05-23
 */
@RestController
@RequestMapping("/aop/order")
public class OrderController {
    @Autowired
    IOrderService iOrderService;

    @GetMapping("/get/{id}")
    public List<Order> get(@PathVariable("id") Integer id){
        return iOrderService.get(id);
    }

}

