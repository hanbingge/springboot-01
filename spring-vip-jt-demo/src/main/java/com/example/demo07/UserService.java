package com.example.demo07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 帅气的景天老师
 * @create 2021/8/3 17:02
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getUser(){
        return userDao.selectUser();
    }

    public int addUser(User user){
        return userDao.addUser(user);
    }
}
