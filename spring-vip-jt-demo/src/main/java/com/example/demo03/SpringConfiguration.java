package com.example.demo03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 帅气的景天老师
 * @create 2021/8/3 17:16
 */
@Configuration
public class SpringConfiguration {

    @Bean
    public HelloService03 helloService03(){
        return new HelloService03();
    }

    @Bean
    public HelloController03 helloController03(){
        return new HelloController03();
    }
}
