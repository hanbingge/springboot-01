package com.example.springbootvipjtdemo.starterdemo;

import com.gupao.redisson.Humen;
import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 帅气的景天老师
 * @create 2021/8/11 11:43
 */
@RestController
@ConditionalOnClass(Redisson.class)
public class StarterController {

    @Autowired
    RedissonClient redissonClient;

    @Autowired
    Humen humen;

    @GetMapping("/say")
    public String say(){
        RBucket bucket = redissonClient.getBucket("name");
        if(bucket.get()==null){
            bucket.set("景天好帅 ");
        }
        return redissonClient.getBucket("name").get().toString();
    }

    @GetMapping("/dance")
    public String dance(){
        return humen.dancing();
    }
}
