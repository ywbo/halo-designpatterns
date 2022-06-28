package com.ilearning.design.impl;

import com.ilearning.design.CouponDisCount;

import java.math.BigDecimal;

/**
 * n元购买
 */
public class NYGCouponDiscount implements CouponDisCount<Double> {

    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }

}
