package com.tiger.demo.learn.aopannotation.aop.service;

import com.tiger.demo.learn.aopannotation.aop.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zxl
 * @since 2019-05-23
 */
public interface IOrderService extends IService<Order> {
    List<Order> get(Integer id);
}
