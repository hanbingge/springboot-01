package com.example.demo04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 帅气的景天老师
 * @create 2021/8/3 17:16
 */
@Configuration
public class SpringConfiguration041 {

    @Bean
    public HelloService041 helloService041(){
        return new HelloService041();
    }

    @Bean
    public HelloController041 helloController041(){
        return new HelloController041();
    }
}
