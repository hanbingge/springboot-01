package com.example.springbootvipjtdemo.demo04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 帅气的景天老师
 * @create 2021/8/4 19:29
 */
@Configuration
public class MybatisConfiguration {

    @Bean
    public GpSqlSessionFactory gpSqlSessionFactory(){
        return new GpSqlSessionFactory();
    }
}
