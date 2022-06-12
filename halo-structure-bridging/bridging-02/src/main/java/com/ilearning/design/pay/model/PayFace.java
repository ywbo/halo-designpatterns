package com.ilearning.design.pay.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 刷脸支付
 *
 * @author yuwenbo
 * @date 2022/6/13 6:12
 **/
public class PayFace implements PayModel {
    private Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Override
    public boolean security(String uId) {
        logger.info("刷脸支付，环境风控校验安全！");
        return true;
    }
}
