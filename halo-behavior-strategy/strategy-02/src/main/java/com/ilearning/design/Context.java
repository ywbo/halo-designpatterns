package com.ilearning.design;

import java.math.BigDecimal;

/**
 * 策略控制类
 *
 * @author yuwenbo
 * @date 2022/6/29 6:20
 **/
public class Context<T> {
    private CouponDisCount<T> couponDisCount;

    public Context(CouponDisCount<T> couponDisCount) {
        this.couponDisCount = couponDisCount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDisCount.discountAmount(couponInfo, skuPrice);
    }
}
