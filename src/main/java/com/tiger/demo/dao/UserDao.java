package com.tiger.demo.dao;

import com.tiger.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserDao {

    @Select("SELECT id,user_name as userName FROM t_user WHERE id = #{id}")
    User queryUser(Integer id);

}
