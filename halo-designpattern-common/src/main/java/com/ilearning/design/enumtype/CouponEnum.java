package com.ilearning.design.enumtype;

/**
 * [策略模式]优惠券类型枚举
 *
 * @author yuwenbo
 * @date 2022/6/29 6:05
 **/
public enum CouponEnum {

    /**
     * 1. 直减券
     */
    ZJ_COUPON(1),

    /**
     * 2. 满减券
     */
    MJ_COUPON(2),

    /**
     * 3. 折扣券
     */
    ZK_COUPON(3),

    /**
     * 4. n元购
     */
    NYG_COUPON(4);

    private int couponType;

    public int getCouponType() {
        return couponType;
    }

    CouponEnum(int couponType) {
        this.couponType = couponType;
    }
}
