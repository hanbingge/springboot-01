package com.example.springbootvipjtdemo.demo01.services.impl;

import com.example.springbootvipjtdemo.demo01.dao.entity.User;
import com.example.springbootvipjtdemo.demo01.dao.mappers.UserMapper;
import com.example.springbootvipjtdemo.demo01.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 帅气的景天老师
 * @create 2021/8/2 16:47
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectUser(long userId) {
        return userMapper.selectUser(userId);
    }
}
