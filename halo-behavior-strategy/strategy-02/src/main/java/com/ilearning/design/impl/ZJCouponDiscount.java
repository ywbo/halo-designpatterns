package com.ilearning.design.impl;

import com.ilearning.design.CouponDisCount;

import java.math.BigDecimal;

/**
 * 直减
 */
public class ZJCouponDiscount implements CouponDisCount<Double> {

    /**
     * 直减计算
     * 1. 使用商品价格减去优惠价格
     * 2. 最低支付金额1元
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;
        return discountAmount;
    }

}
