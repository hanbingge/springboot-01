package com.example.springbootvipjtdemo.myconfig;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 帅气的景天老师
 * @create 2022/6/21 14:03
 */
public class MyPropertySourceListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {

        MutablePropertySources destination = event.getEnvironment().getPropertySources();
        Properties properties = new Properties();
        try {
            InputStream in = MyPropertySourceListener.class.getClassLoader().getResourceAsStream("shuaigejt.properties");
            properties.load(in);
            ConcurrentHashMap<Object,Object> ch = new ConcurrentHashMap<>();
            for (Map.Entry entry : properties.entrySet()) {
                ch.put(entry.getKey(),entry.getValue());
            }
            OriginTrackedMapPropertySource source = new OriginTrackedMapPropertySource("shuaigejt.properties",ch);
            destination.addLast(source);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
