package com.ilearning.design.test;

import com.ilearning.design.AwardFactory;
import com.ilearning.design.commodity.ICommodity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试类
 *
 * @author yuwenbo
 * @date 2022/5/27 23:33
 **/
public class ApiTest {
    @Test
    public void test_commodity() throws Exception {
        AwardFactory awardFactory = new AwardFactory();

        // 1. 优惠券
        ICommodity commodityService_1 = awardFactory.getAwardService(1);
        commodityService_1.sendAward("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        ICommodity commodityService_2 = awardFactory.getAwardService(2);
        Map<String, String> extMap = new HashMap<String, String>();
        extMap.put("consigneeUserName", "飞机");
        extMap.put("consigneeUserPhone", "15300002222");
        extMap.put("consigneeUserAddress", "陕西省.西安市.雁塔区.XX街道.小区.#18-2109");

        commodityService_2.sendAward("10001", "9820198721311", "1023000020112221113", new HashMap<String, String>() {{
            put("consigneeUserName", "飞机");
            put("consigneeUserPhone", "15300003333");
            put("consigneeUserAddress", "陕西省.西安市.雁塔区.XX街道.小区.#18-2109");
        }});

        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3 = awardFactory.getAwardService(3);
        commodityService_3.sendAward("10001", "AQY1xjkUodl8LO975GdfrYUio", null, null);

    }
}
