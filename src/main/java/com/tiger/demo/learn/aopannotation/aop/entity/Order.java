package com.tiger.demo.learn.aopannotation.aop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.tiger.demo.learn.aopannotation.annotion.NeedSetValue;
import com.tiger.demo.learn.aopannotation.aop.mapper.UserMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxl
 * @since 2019-05-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Order implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户名
     */
    @NeedSetValue(beanClass = UserMapper.class,param = "userId",
            method = "get",targetFiled = "userName")
    private String userName;


}
