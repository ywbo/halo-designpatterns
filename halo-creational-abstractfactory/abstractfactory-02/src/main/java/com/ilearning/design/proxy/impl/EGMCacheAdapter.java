package com.ilearning.design.proxy.impl;

import com.ilearning.design.matter.EGM;
import com.ilearning.design.proxy.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * EGM 适配器
 *
 * @author yuwenbo
 * @date 2022/5/31 6:31
 **/
public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
