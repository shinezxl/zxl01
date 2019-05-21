package com.tiger.demo.learn.mybatisplus.sys.service.impl;

import com.tiger.demo.learn.mybatisplus.sys.entity.User;
import com.tiger.demo.learn.mybatisplus.sys.mapper.UserMapper;
import com.tiger.demo.learn.mybatisplus.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author zxl
 * @since 2019-05-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
