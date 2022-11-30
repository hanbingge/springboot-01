package com.example.demo05;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * @author 帅气的景天老师
 * @create 2021/8/4 16:19
 */
public class TaskService02 {

    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime(){
        System.out.println("current Time:"+new Date());
    }
}
