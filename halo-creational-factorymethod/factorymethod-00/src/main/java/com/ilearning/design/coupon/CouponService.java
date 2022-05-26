package com.ilearning.design.coupon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 优惠券公共业务类
 *
 * @author yuwenbo
 * @date 2022/5/26 23:21
 **/
public class CouponService {
    private Logger logger = LoggerFactory.getLogger(CouponService.class);

    public CouponResult sendCoupon(String uId, String couponNum, String uuid){
        logger.debug("模拟{}发放优惠券{}一张。uuid:{}", uId, couponNum, uuid);
        return new CouponResult("0000", "发送成功");
    }
}
