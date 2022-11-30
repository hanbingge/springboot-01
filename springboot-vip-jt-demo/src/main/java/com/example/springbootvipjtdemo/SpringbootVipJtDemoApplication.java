package com.example.springbootvipjtdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootVipJtDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootVipJtDemoApplication.class, args);
        System.out.println(context.getEnvironment().getProperty("gp.girl.name"));
    }

}
