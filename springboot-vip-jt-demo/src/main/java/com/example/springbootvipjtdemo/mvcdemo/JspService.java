package com.example.springbootvipjtdemo.mvcdemo;

import org.springframework.stereotype.Service;

/**
 * @author 帅气的景天老师
 * @create 2022/6/11 16:03
 */
@Service
public class JspService {
    public String sayHello(String name){
        return "你真棒！"+name;
    }
}
