package com.ilearning.design.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 查询第三方用户订单数量接口
 *
 * @author yuwenbo
 * @date 2022/6/4 23:05
 **/
public class ThirdPartyOrderService {

    private Logger logger = LoggerFactory.getLogger(OrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }
}
