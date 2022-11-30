package com.example.demo06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 帅气的景天老师
 * @create 2021/8/4 16:41
 */
public class Demo06Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration06.class);
        System.out.println(context.getBean(Demo06Service.class));
    }
}
