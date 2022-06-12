package com.ilearning.design.pay.channel;

import com.ilearning.design.pay.model.PayModel;

import java.math.BigDecimal;

/**
 * 微信支付
 *
 * @author yuwenbo
 * @date 2022/6/13 5:57
 **/
public class WxPay extends Pay {

    public WxPay(PayModel payModel) {
        super(payModel);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("模拟微信渠道支付开始。uId:{}, tradeId:{}, amount:{}", uId, tradeId, amount);
        boolean security = payModel.security(uId);
        logger.info("模拟微信渠道支付分控校验。uId:{}, tradeId:{}, amount:{}", uId, tradeId, amount);
        if (!security) {
            logger.info("模拟微信渠道支付拦截。uId:{}, tradeId:{}, amount:{}", uId, tradeId, amount);
            return "wx-0001";
        }
        logger.info("模拟微信渠道支付成功。uId:{}, tradeId:{}, amount:{}", uId, tradeId, amount);
        return "wx-0000";
    }
}
