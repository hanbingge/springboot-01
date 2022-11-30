package com.example.demo04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 帅气的景天老师
 * @create 2021/8/3 17:16
 */
@Configuration
@Import(SpringConfiguration041.class)
public class SpringConfiguration04 {

    @Bean
    public HelloService04 helloService04(){
        return new HelloService04();
    }

    @Bean
    public HelloController04 helloController04(){
        return new HelloController04();
    }
}
