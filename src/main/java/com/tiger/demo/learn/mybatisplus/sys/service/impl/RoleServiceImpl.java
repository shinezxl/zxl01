package com.tiger.demo.learn.mybatisplus.sys.service.impl;

import com.tiger.demo.learn.mybatisplus.sys.entity.Role;
import com.tiger.demo.learn.mybatisplus.sys.mapper.RoleMapper;
import com.tiger.demo.learn.mybatisplus.sys.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author zxl
 * @since 2019-05-21
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
