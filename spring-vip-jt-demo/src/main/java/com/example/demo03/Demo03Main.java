package com.example.demo03;

import com.example.demo02.HelloController02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author 帅气的景天老师
 * @create 2021/8/3 17:03
 */
public class Demo03Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println(context.getBean(HelloController03.class));
    }
}
