package com.example.springbootvipjtdemo.demo02;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 帅气的景天老师
 * @create 2022/6/9 16:55
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(ImportSelectorDemo.class)
public @interface EnableMyConfiguration {
}
