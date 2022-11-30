package com.example.demo04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 帅气的景天老师
 * @create 2021/8/3 17:03
 */
public class Demo04Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration04.class);
        System.out.println(context.getBean(HelloController041.class));
    }
}
