package com.example.springbootvipjtdemo.demo01.services;


import com.example.springbootvipjtdemo.demo01.dao.entity.User;

public interface IUserService {

    int insert(User user);

    User selectUser(long userId);
}
