package com.ilearning.design;

import java.util.concurrent.TimeUnit;

/**
 * 不使用设计模式的缓存接口类
 *
 * @author yuwenbo
 * @date 2022/5/30 23:33
 **/
public interface CacheService {
    String get(String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);
}
