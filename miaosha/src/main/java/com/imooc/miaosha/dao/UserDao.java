package com.imooc.miaosha.dao;

import com.imooc.miaosha.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserDao {
//    @Select("select * from user where id=#{id}")
//    public List<User> userByid(int id);

    @Select("select * from user where id=#{id}")
    public User userByid(@Param("id") int id);
}
