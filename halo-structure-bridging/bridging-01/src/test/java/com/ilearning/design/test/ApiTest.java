package com.ilearning.design.test;

import com.ilearning.design.PayController;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * 非桥接模式 测试类
 *
 * @author yuwenbo
 * @date 2022/6/10 6:37
 **/
public class ApiTest {
    @Test
    public void test_pay() {
        PayController pay = new PayController();

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        pay.doPay("weixin_20220610", "100000109893", new BigDecimal(100), 1, 5);

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        pay.doPay("zfb_20220610", "100000109894", new BigDecimal(100), 2, 4);
    }
}
