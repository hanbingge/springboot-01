package com.example.demo05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 帅气的景天老师
 * @create 2021/8/3 17:03
 */
public class TaskMain02 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TaskConfiguration.class);
    }
}
