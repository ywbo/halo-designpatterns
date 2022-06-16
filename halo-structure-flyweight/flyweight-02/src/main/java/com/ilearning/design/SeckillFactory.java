package com.ilearning.design;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 秒杀工厂
 *
 * @author yuwenbo
 * @date 2022/6/16 22:29
 **/
public class SeckillFactory {
    static Map<Long, Seckill> seckillMap = new ConcurrentHashMap<>();

    public static Seckill getSeckill(Long id) {
        Seckill seckill = seckillMap.get(id);
        if (null == seckill) {
            // 模拟从实际业务应用从接口中获取活动信息
            seckill = new Seckill();
            seckill.setId(10001L);
            seckill.setName("图书嗨乐");
            seckill.setDesc("图书优惠券分享激励分享活动第二期");
            seckill.setStartTime(new Date());
            seckill.setStopTime(new Date());
            seckillMap.put(id, seckill);
        }
        return seckill;
    }
}
