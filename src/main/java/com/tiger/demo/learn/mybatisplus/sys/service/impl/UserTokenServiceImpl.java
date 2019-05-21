package com.tiger.demo.learn.mybatisplus.sys.service.impl;

import com.tiger.demo.learn.mybatisplus.sys.entity.UserToken;
import com.tiger.demo.learn.mybatisplus.sys.mapper.UserTokenMapper;
import com.tiger.demo.learn.mybatisplus.sys.service.IUserTokenService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户Token 服务实现类
 * </p>
 *
 * @author zxl
 * @since 2019-05-21
 */
@Service
public class UserTokenServiceImpl extends ServiceImpl<UserTokenMapper, UserToken> implements IUserTokenService {

}
