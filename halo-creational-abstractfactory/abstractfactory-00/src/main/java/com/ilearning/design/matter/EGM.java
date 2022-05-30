package com.ilearning.design.matter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * EGM 模拟集群
 *
 * @author yuwenbo
 * @date 2022/5/30 22:57
 **/
public class EGM {
    private Logger logger = LoggerFactory.getLogger(EGM.class);
    
    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        logger.info("EGM 获得数据 key：{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("EGM 写入数据 key：{}，val：{}", key, value);
        dataMap.put(key, value);
    }

    public void setExpire(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("EGM 写入数据 key：{}， val：{}， timeout：{}， timeUnit：{}", key, value, timeout, timeUnit);
        dataMap.put(key, value);
    }

    public void delete(String key) {
        logger.info("EGM 删除数据 key：{}", key);
        dataMap.remove(key);
    }
}
