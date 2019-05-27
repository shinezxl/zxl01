package com.tiger.demo.learn.aopannotation.aop.service.impl;

import com.tiger.demo.learn.aopannotation.annotion.NeedSetFeildValue;
import com.tiger.demo.learn.aopannotation.aop.entity.Order;
import com.tiger.demo.learn.aopannotation.aop.mapper.OrderMapper;
import com.tiger.demo.learn.aopannotation.aop.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxl
 * @since 2019-05-23
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
    @Autowired(required = false)
    OrderMapper orderMapper;

    @Override
    @NeedSetFeildValue
    public List<Order> get(Integer id) {
        Order order = orderMapper.get(id);
        List<Order> list = new ArrayList<>();
        list.add(order);
        return list;
    }
}
