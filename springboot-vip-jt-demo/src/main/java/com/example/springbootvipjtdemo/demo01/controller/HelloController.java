package com.example.springbootvipjtdemo.demo01.controller;

import com.example.springbootvipjtdemo.demo01.dao.entity.User;
import com.example.springbootvipjtdemo.demo01.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 帅气的景天老师
 * @create 2021/8/2 16:33
 */
@RestController
public class HelloController {

    @Autowired
    IUserService userService;

    @PostMapping("addUser")
    public String addUser(@RequestBody User user){
        int a = userService.insert(user);
        if(a!=0){
            return "插入成功";
        }else{
            return "失败";
        }
    }

    @GetMapping("getUser")
    public String getUser(@RequestParam String userId){
        long id = Long.parseLong(userId);
        User user = userService.selectUser(id);
        return user.toString();
    }
}
