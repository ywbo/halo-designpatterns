package com.ilearning.design;

import static com.ilearning.design.enumtype.CouponEnum.*;

/**
 * 优惠券折扣计算服务接口
 *
 * @author yuwenbo
 * @date 2022/6/29 6:04
 **/
public class CouponDiscountService {
    public double discountAmount(int type, double typeContent, double skuPrice, double typeExt) {
        // 1. 直减券
        if (ZJ_COUPON.getCouponType() == type) {
            return skuPrice - typeContent;
        }

        // 2. 满减券
        if (MJ_COUPON.getCouponType() == type) {
            if (skuPrice < typeExt) {
                return skuPrice;
            }
            return skuPrice - typeContent;
        }

        // 3. 折扣券
        if (ZK_COUPON.getCouponType() == type) {
            return skuPrice * typeContent;
        }

        // 4. n元购
        if (NYG_COUPON.getCouponType() == type) {
            return typeContent;
        }
        return 0D;
    }
}
