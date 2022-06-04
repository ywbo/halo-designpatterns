package com.ilearning.design.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 查询用户订单数量接口
 *
 * @author yuwenbo
 * @date 2022/6/4 23:01
 **/
public class OrderService {

    private Logger logger = LoggerFactory.getLogger(OrderService.class);

    public long queryUserOrderCount(String userId) {
        logger.info("自营商家，查询用户的订单是否为首单：{}。", userId);
        return 10L;
    }
}
