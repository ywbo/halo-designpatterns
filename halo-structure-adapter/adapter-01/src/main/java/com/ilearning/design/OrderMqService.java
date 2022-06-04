package com.ilearning.design;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.mq.OrderMq;

/**
 * 查询用户订单数量
 *
 * @author yuwenbo
 * @date 2022/6/4 23:11
 **/
public class OrderMqService {

    public void onMessage(String message) {
        OrderMq mq = JSON.parseObject(message, OrderMq.class);
        
        mq.getOrderId();
        mq.getSku();
        mq.getCreateOrderTime();

        // ... 处理自己的业务逻辑
    }
}
