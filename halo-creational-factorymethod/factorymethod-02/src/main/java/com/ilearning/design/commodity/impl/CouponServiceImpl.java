package com.ilearning.design.commodity.impl;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.commodity.ICommodity;
import com.ilearning.design.coupon.CouponResult;
import com.ilearning.design.coupon.CouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 优惠券实现类
 *
 * @author yuwenbo
 * @date 2022/5/27 23:07
 **/
public class CouponServiceImpl implements ICommodity {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);

    private CouponService couponService = new CouponService();

    /**
     * 发放优惠券奖励
     *
     * @param uId
     * @param awardNum
     * @param bizId
     * @param extMap
     */
    @Override
    public void sendAward(String uId, String awardNum, String bizId, Map<String, String> extMap) {
        CouponResult couponResult = couponService.sendCoupon(uId, awardNum, bizId);
        logger.debug("请求参数[优惠券] => uId：{}, awardNum：{}, bizId：{}, extMap：{}", uId, awardNum, bizId, JSON.toJSON(extMap));
        logger.debug("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getInfo());
        }
    }

}
