package com.ilearning.design.coupon;

import lombok.Data;

/**
 * 优惠券公共结果类
 *
 * @author yuwenbo
 * @date 2022/5/26 23:23
 **/
@Data
public class CouponResult {
    private String code; // 编码
    private String info; // 描述

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
