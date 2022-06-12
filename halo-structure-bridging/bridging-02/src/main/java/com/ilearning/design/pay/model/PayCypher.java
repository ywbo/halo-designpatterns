package com.ilearning.design.pay.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 密码支付
 *
 * @author yuwenbo
 * @date 2022/6/13 6:09
 **/
public class PayCypher implements PayModel {
    private Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Override
    public boolean security(String uId) {
        logger.info("密码支付，环境风控校验安全！");
        return true;
    }
}
