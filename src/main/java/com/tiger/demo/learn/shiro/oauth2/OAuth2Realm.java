package com.tiger.demo.learn.shiro.oauth2;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tiger.demo.learn.mybatisplus.entity.SysMenu;
import com.tiger.demo.learn.mybatisplus.entity.SysUser;
import com.tiger.demo.learn.mybatisplus.entity.SysUserToken;
import com.tiger.demo.learn.mybatisplus.mapper.SysMenuMapper;
import com.tiger.demo.learn.mybatisplus.mapper.SysUserMapper;
import com.tiger.demo.learn.mybatisplus.mapper.SysUserTokenMapper;
import com.tiger.demo.learn.shiro.utils.Constant;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 认证
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-20 14:00
 */
@Component
public class OAuth2Realm extends AuthorizingRealm {

    @Autowired(required = false)
    SysUserTokenMapper sysUserTokenMapper;

    @Autowired(required = false)
    SysUserMapper sysUserMapper;

    @Autowired(required = false)
    SysMenuMapper sysMenuMapper;


    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof OAuth2Token;
    }

    /**
     * 授权(验证权限时调用)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SysUser user = (SysUser)principals.getPrimaryPrincipal();
        Long userId = user.getUserId();
        //用户权限列表
        Set<String> permsSet = getUserPermissions(userId);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(permsSet);
        return info;
    }

    public Set<String> getUserPermissions(long userId) {
        List<String> permsList;

        //系统管理员，拥有最高权限
        if(userId == Constant.SUPER_ADMIN){
            List<SysMenu> menuList = sysMenuMapper.selectList(null);
            permsList = new ArrayList<>(menuList.size());
            for(SysMenu menu : menuList){
                permsList.add(menu.getPerms());
            }
        }else{
            permsList = sysMenuMapper.queryPermsByUserId(userId);
        }
        //用户权限列表
        Set<String> permsSet = new HashSet<>();
        for(String perms : permsList){
            if(StringUtils.isBlank(perms)){
                continue;
            }
            permsSet.addAll(Arrays.asList(perms.trim().split(",")));
        }
        return permsSet;
    }

    /**
     * 认证(登录时调用)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String accessToken = (String) token.getPrincipal();

        //根据accessToken，查询用户信息
        SysUserToken sysUserToken = sysUserTokenMapper.selectOne(new QueryWrapper<SysUserToken>().eq("token",accessToken));
        //token失效
        if(sysUserToken == null || sysUserToken.getExpireTime().getTime() < System.currentTimeMillis()){
            throw new IncorrectCredentialsException("token失效，请重新登录");
        }
        //查询用户信息
        SysUser user = sysUserMapper.selectById(sysUserToken.getUserId());
        //账号锁定
        if(user.getStatus() == 0){
            throw new LockedAccountException("账号已被锁定,请联系管理员");
        }

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, accessToken, getName());
        return info;
    }
}
