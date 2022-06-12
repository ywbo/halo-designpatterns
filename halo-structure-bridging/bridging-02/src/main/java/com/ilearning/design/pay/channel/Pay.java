package com.ilearning.design.pay.channel;

import com.ilearning.design.pay.model.PayModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 抽象基类
 *
 * @author yuwenbo
 * @date 2022/6/12 17:28
 **/
public abstract class Pay {
    
    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    protected PayModel payModel;

    public Pay(PayModel payModel) {
        this.payModel = payModel;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
