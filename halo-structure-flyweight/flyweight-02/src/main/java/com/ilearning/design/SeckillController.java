package com.ilearning.design;

import com.ilearning.design.utils.RedisUtil;

/**
 * 设计模式下的业务逻辑
 *
 * @author yuwenbo
 * @date 2022/6/16 22:31
 **/
public class SeckillController {
    private RedisUtil redisUtils = new RedisUtil();

    public Seckill queryActivityInfo(Long id) {
        Seckill seckill = SeckillFactory.getSeckill(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        seckill.setStock(stock);
        return seckill;
    }
}
