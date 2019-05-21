package com.tiger.demo.learn.mybatisplus.mapper;

import com.tiger.demo.learn.mybatisplus.entity.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 菜单管理 Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2019-05-21
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<String> queryPermsByUserId(@Param("userId") Long userId);
}
