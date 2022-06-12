package com.ilearning.design.pay.channel;

import com.ilearning.design.pay.model.PayModel;

import java.math.BigDecimal;

/**
 * 支付宝支付
 *
 * @author yuwenbo
 * @date 2022/6/13 6:06
 **/
public class ZfbPay extends Pay {

    public ZfbPay(PayModel payModel) {
        super(payModel);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("模拟支付宝渠道支付开始。uId:{}, tradeId:{}, amount:{}", uId, tradeId, amount);
        boolean security = payModel.security(uId);
        logger.info("模拟支付宝渠道支付分控校验。uId:{}, tradeId:{}, amount:{}", uId, tradeId, amount);
        if (!security) {
            logger.info("模拟支付宝渠道支付拦截。uId:{}, tradeId:{}, amount:{}", uId, tradeId, amount);
            return "zfb-0001";
        }
        logger.info("模拟支付宝渠道支付成功。uId:{}, tradeId:{}, amount:{}", uId, tradeId, amount);
        return "zfb-0000";
    }
}
