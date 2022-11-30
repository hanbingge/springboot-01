package com.example.springbootvipjtdemo.demo01.dao.mappers;

import com.example.springbootvipjtdemo.demo01.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int insert(User user);

    User selectUser(long userId);
}
