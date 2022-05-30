package com.ilearning.design.proxy;

import java.util.concurrent.TimeUnit;

/**
 * 缓存适配器
 *
 * @author yuwenbo
 * @date 2022/5/31 6:30
 **/
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
