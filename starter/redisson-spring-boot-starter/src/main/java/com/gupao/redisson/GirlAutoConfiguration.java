package com.gupao.redisson;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 帅气的景天老师
 * @create 2021/8/11 11:05
 */
@ConditionalOnClass(Redisson.class)//条件装配
@EnableConfigurationProperties(GirlProperties.class)
@Configuration
public class GirlAutoConfiguration {

    @Bean
    Humen humen(GirlProperties girlProperties){
        return Girl.create(girlProperties.getName());
    }
}
