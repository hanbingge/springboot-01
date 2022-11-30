package com.example.demo05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 帅气的景天老师
 * @create 2021/8/4 16:19
 */
@EnableScheduling
@Configuration
public class TaskConfiguration {

    @Bean
    public TaskService02 taskService02(){
        return new TaskService02();
    }
}
