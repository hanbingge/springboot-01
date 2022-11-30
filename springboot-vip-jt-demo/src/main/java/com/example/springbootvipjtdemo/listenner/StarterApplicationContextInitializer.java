package com.example.springbootvipjtdemo.listenner;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 帅气的景天老师
 * @create 2021/12/8 14:35
 */
public class StarterApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("景天是咕泡最帅的，不接受反驳。。。");
    }
}
