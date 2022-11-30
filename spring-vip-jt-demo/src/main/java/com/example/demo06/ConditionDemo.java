package com.example.demo06;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author 帅气的景天老师
 * @create 2021/8/4 16:38
 */
public class ConditionDemo implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if(1==1){
            return true;
        }else{
            return false;
        }
    }
}
