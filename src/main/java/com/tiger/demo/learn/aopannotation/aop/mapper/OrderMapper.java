package com.tiger.demo.learn.aopannotation.aop.mapper;

import com.tiger.demo.learn.aopannotation.aop.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2019-05-23
 */
public interface OrderMapper extends BaseMapper<Order> {
    Order get(@Param("id") Integer id);
}
