package com.ilearning.design.pay.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 指纹支付
 *
 * @author yuwenbo
 * @date 2022/6/13 6:14
 **/
public class PayFingerprint implements PayModel {
    private Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Override
    public boolean security(String uId) {
        logger.info("指纹支付，环境风控校验安全！");
        return true;
    }
}
