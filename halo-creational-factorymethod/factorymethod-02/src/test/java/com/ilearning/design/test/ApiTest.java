package com.ilearning.design.test;

import com.ilearning.design.AwardFactory;
import com.ilearning.design.commodity.ICommodity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.ilearning.design.enumtype.AwardTypeEnum.*;

/**
 * Api测试类
 *
 * @author yuwenbo
 * @date 2022/5/27 23:33
 **/
public class ApiTest {

    @Test
    public void test_award() {
        AwardFactory awardFactory = new AwardFactory();

        // 1. 优惠券
        ICommodity commodityService_1 = awardFactory.getAwardService(COUPON.getEnvState());
        commodityService_1.sendAward("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        ICommodity commodityService_2 = awardFactory.getAwardService(GOODS.getEnvState());
        Map<String, String> extMap = new HashMap<String, String>();
        extMap.put("consigneeUserName", "实物商品");
        extMap.put("consigneeUserPhone", "15300002222");
        extMap.put("consigneeUserAddress", "陕西省.西安市.雁塔区.XX街道.小区.#18-2109");

        commodityService_2.sendAward("10001", "9820198721311", "1023000020112221113", extMap);

        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3 = awardFactory.getAwardService(CARD.getEnvState());
        commodityService_3.sendAward("10001", "AQY1xjkUodl8LO975GdfrYUio", null, null);

    }
}
