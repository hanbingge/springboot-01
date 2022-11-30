package com.example.springbootvipjtdemo.demo02;

import com.example.springbootvipjtdemo.demo03.GpRedisTemplate;
import com.example.springbootvipjtdemo.demo04.GpSqlSessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 帅气的景天老师
 * @create 2022/6/9 17:04
 */
@EnableMyConfiguration
@SpringBootApplication
public class SpringBootAutoDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootAutoDemo.class, args);
        System.out.println(context.getBean(GpRedisTemplate.class));
        System.out.println(context.getBean(GpSqlSessionFactory.class));
    }
}
