package com.ilearning.design.test;

import com.ilearning.design.pay.channel.WxPay;
import com.ilearning.design.pay.channel.ZfbPay;
import com.ilearning.design.pay.model.PayCypher;
import com.ilearning.design.pay.model.PayFace;
import com.ilearning.design.pay.model.PayFingerprint;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 桥接模式测试类
 *
 * @author yuwenbo
 * @date 2022/6/13 6:15
 **/
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Test
    public void test_pay() {
        logger.info("模拟微信支付，支付方式为：微信支付 + 指纹支付。");
        WxPay wxPay = new WxPay(new PayFingerprint());
        wxPay.transfer("wx_123098", "10001123", new BigDecimal(100));

        logger.info("模拟支付宝支付，方式为：支付宝支付 + 刷脸支付。");
        ZfbPay zfbPay = new ZfbPay(new PayFace());
        zfbPay.transfer("zfb_456098", "10001456", new BigDecimal(200));
    }
}
