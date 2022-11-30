package com.example.springbootvipjtdemo.environmenttest;


import com.example.springbootvipjtdemo.SpringbootVipJtDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 帅气的景天老师
 * @create 2022/5/6 10:21
 * 获取配置文件的内容
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootVipJtDemoApplication.class)
public class MyTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${jt.yz:henshuai}")
    private String yz;

    @Test
    public void value(){
        String property = applicationContext.getEnvironment().getProperty("jt.yz");
        System.out.println(property);
    }

    @Test
    public void value1(){
        System.out.println(yz);
    }
}
