package com.ilearning.design;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.mq.ThirdPartyOrderMq;

/**
 * 第三方订单数量查询
 *
 * @author yuwenbo
 * @date 2022/6/4 23:14
 **/
public class ThirdPartyOrderService {

    public void onMessage(String message) {
        ThirdPartyOrderMq mq = JSON.parseObject(message, ThirdPartyOrderMq.class);
        mq.getOrderId();
        mq.getSku();
        mq.getSkuName();

        // ... 处理自己的业务逻辑
    }
}
