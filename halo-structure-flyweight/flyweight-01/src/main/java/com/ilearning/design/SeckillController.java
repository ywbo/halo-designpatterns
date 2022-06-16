package com.ilearning.design;

import java.util.Date;

/**
 * [享元模式]非设计模式的业务实现
 *
 * @author yuwenbo
 * @date 2022/6/16 22:17
 **/
public class SeckillController {
    public Seckill queryActivityInfo(Long id) {
        // 模拟从实际业务应用从接口中获取活动信息
        Seckill seckill = new Seckill();
        seckill.setId(10001L);
        seckill.setName("图书嗨乐");
        seckill.setDesc("图书优惠券分享激励分享活动第二期");
        seckill.setStartTime(new Date());
        seckill.setStopTime(new Date());
        seckill.setStock(new Stock(1000, 1));
        return seckill;
    }
}
