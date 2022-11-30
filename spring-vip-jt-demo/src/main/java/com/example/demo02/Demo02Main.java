package com.example.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author 帅气的景天老师
 * @create 2021/8/3 17:03
 */
public class Demo02Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println(context.getBean(HelloController02.class));
    }
}
