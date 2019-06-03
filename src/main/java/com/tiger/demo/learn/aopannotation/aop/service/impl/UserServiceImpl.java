package com.tiger.demo.learn.aopannotation.aop.service.impl;

import com.tiger.demo.learn.aopannotation.aop.constant.AopConstant;
import com.tiger.demo.learn.aopannotation.aop.entity.User;
import com.tiger.demo.learn.aopannotation.aop.mapper.UserMapper;
import com.tiger.demo.learn.aopannotation.aop.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxl
 * @since 2019-05-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired(required = false)
    UserMapper userMapper;
    @Override
    public void test(String key) {

        try {
            boolean b = AopConstant.map.containsKey(key);
            if (b){
                System.out.println("存在");
                return;
            }else {
                AopConstant.map.put(key,null);
            }
            Thread.sleep(1000);
            userMapper.test();
            AopConstant.map.remove(key);
        } catch (Exception e) {
            if (AopConstant.map.containsKey(key)){
                AopConstant.map.remove(key);
            }
        }
    }
}
