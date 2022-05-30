package com.ilearning.design.impl;

import com.ilearning.design.CacheService;
import com.ilearning.design.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * 缓存实现类
 *
 * @author yuwenbo
 * @date 2022/5/30 22:55
 **/
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void delete(String key) {
        redisUtils.del(key);
    }
}
