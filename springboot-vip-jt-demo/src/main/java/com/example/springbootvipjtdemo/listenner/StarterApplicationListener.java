package com.example.springbootvipjtdemo.listenner;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author 帅气的景天老师
 * @create 2021/12/8 14:35
 */
public class StarterApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.toString());
        System.out.println("ApplicationListener .... " + System.currentTimeMillis());
    }
}
