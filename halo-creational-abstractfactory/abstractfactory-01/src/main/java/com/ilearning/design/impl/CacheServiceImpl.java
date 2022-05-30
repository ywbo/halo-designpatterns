package com.ilearning.design.impl;

import com.ilearning.design.CacheService;
import com.ilearning.design.RedisUtils;
import com.ilearning.design.matter.EGM;
import com.ilearning.design.matter.IIR;

import java.util.concurrent.TimeUnit;

import static com.ilearning.design.enumtype.RedisTypeEnum.EGM_TYPE;
import static com.ilearning.design.enumtype.RedisTypeEnum.IIR_TYPE;

/**
 * 缓存接口实现类
 *
 * @author yuwenbo
 * @date 2022/5/30 23:19
 **/
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    private EGM egm = new EGM();

    private IIR iir = new IIR();

    @Override
    public String get(String key, int redisType) {

        if (EGM_TYPE.getRedisType() == redisType) {
            return egm.gain(key);
        }

        if (IIR_TYPE.getRedisType() == redisType) {
            return iir.get(key);
        }

        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value, int redisType) {

        if (EGM_TYPE.getRedisType() == redisType) {
            egm.set(key, value);
            return;
        }

        if (IIR_TYPE.getRedisType() == redisType) {
            iir.set(key, value);
            return;
        }

        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {

        if (EGM_TYPE.getRedisType() == redisType) {
            egm.setExpire(key, value, timeout, timeUnit);
            return;
        }

        if (IIR_TYPE.getRedisType() == redisType) {
            iir.setExpire(key, value, timeout, timeUnit);
            return;
        }

        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key, int redisType) {

        if (EGM_TYPE.getRedisType() == redisType) {
            egm.delete(key);
            return;
        }

        if (IIR_TYPE.getRedisType() == redisType) {
            iir.del(key);
            return;
        }

        redisUtils.del(key);
    }
}
