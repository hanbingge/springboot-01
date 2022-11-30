package com.example.springbootvipjtdemo.demo03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 帅气的景天老师
 * @create 2021/8/4 19:28
 */
@Configuration
public class RedisConfiguration {

    @Bean
    public GpRedisTemplate gpRedisTemplate(){
        return new GpRedisTemplate();
    }
}
