package com.example.demo06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author 帅气的景天老师
 * @create 2021/8/4 16:34
 */
@Configuration
public class SpringConfiguration06 {

    /**
     * 在某个环境下不装载
     * 或者不满足某个条件的时候，不装载
     * 或者，如果已经装载过了，就不重复装载
     * 。。。
     * @return
     */
    @Conditional(ConditionDemo.class)
    @Bean
    public Demo06Service demo07Service(){
        return new Demo06Service();
    }
}
