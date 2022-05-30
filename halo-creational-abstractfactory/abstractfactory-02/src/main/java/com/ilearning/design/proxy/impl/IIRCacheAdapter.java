package com.ilearning.design.proxy.impl;

import com.ilearning.design.matter.IIR;
import com.ilearning.design.proxy.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * IIR 适配器
 *
 * @author yuwenbo
 * @date 2022/5/31 6:32
 **/
public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
