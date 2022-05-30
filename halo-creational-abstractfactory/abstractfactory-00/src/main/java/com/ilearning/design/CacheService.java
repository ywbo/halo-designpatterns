package com.ilearning.design;

import java.util.concurrent.TimeUnit;

/**
 * 缓存接口类
 *
 * @author yuwenbo
 * @date 2022/5/30 22:40
 **/
public interface CacheService {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void delete(String key);
}
