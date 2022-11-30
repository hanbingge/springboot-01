package com.example.springbootvipjtdemo.demo02;

import com.example.springbootvipjtdemo.demo03.RedisConfiguration;
import com.example.springbootvipjtdemo.demo04.MybatisConfiguration;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @author 帅气的景天老师
 * @create 2022/6/9 16:55
 */
public class ImportSelectorDemo implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //在这个方法里面完成各不同的技术组件的配置类的寻找，并且把配置类的类名返回
        return new String[]{RedisConfiguration.class.getName(), MybatisConfiguration.class.getName()};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }
}
