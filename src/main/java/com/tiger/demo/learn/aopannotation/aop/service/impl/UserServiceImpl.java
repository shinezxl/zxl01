package com.tiger.demo.learn.aopannotation.aop.service.impl;

import com.tiger.demo.learn.aopannotation.aop.constant.AopConstant;
import com.tiger.demo.learn.aopannotation.aop.entity.User;
import com.tiger.demo.learn.aopannotation.aop.mapper.UserMapper;
import com.tiger.demo.learn.aopannotation.aop.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    public static Integer i = 0;
    @Override
    @Transactional
    public void test(String key) {

        try {
           /* boolean b = AopConstant.map.containsKey(key);
            if (b){
                System.out.println("存在");
                return;
            }else {
                AopConstant.map.put(key,null);
            }*/
            Thread.sleep(10);
            i++;
            userMapper.test();
            Thread.sleep(10);
//            AopConstant.map.remove(key);
        } catch (Exception e) {
            /*if (AopConstant.map.containsKey(key)){
                AopConstant.map.remove(key);
            }*/
            e.printStackTrace();
        }
        if (i==50){
            throw new RuntimeException("233");
        }
    }

    @Override
    @Transactional
    public void test2(String key) {

        try {

            Thread.sleep(10);
            userMapper.test();
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    @Transactional
    public void test3(String key) {

        try {

            Thread.sleep(10);
            userMapper.test();
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
