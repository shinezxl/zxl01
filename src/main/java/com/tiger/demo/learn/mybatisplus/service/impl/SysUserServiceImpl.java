package com.tiger.demo.learn.mybatisplus.service.impl;

import com.tiger.demo.learn.mybatisplus.entity.SysUser;
import com.tiger.demo.learn.mybatisplus.mapper.SysUserMapper;
import com.tiger.demo.learn.mybatisplus.service.ISysUserService;
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
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
