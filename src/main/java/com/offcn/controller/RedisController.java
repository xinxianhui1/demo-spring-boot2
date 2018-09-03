package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/getValueFromRedis")
    public String getValueFromRedis(){
//从redis库中取出字符串ename
        String ename = redisTemplate.opsForValue().get("ename");
        return "reids取值ename : "+ename;
    }

    @PutMapping("/setValueToRedis/{ename}")
    public String setValueToRedis(@PathVariable String ename){
//向redis库存入字符串ename
        redisTemplate.opsForValue().set("ename",ename);
        return "redis设置值ename: "+ename;
    }
}