package com.ilearning.design.impl;

import com.ilearning.design.OrderAdapterService;
import com.ilearning.design.service.OrderService;

/**
 * 内部订单
 *
 * @author yuwenbo
 * @date 2022/6/4 23:23
 **/
public class InsiderOrderService implements OrderAdapterService {
    private OrderService orderService = new OrderService();

    @Override

    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
