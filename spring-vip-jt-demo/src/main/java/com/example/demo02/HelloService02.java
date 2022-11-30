package com.example.demo02;

import org.springframework.stereotype.Service;

/**
 * @author 帅气的景天老师
 * @create 2021/8/3 17:02
 */
@Service
public class HelloService02 {
    public String sayHello(String name){
        return "你好帅啊！";
    }
}
