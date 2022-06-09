package com.ilearning.design.enumtype;

/**
 * 桥接模式下的支付方式枚举
 *
 * @author yuwenbo
 * @date 2022/6/10 6:24
 **/
public enum PayTypeEnum {
    /**
     * =================== 支付方式 ====================
     */

    /**
     * 微信支付
     */
    WX_PAY(1),

    /**
     * 支付宝支付
     */
    ZFB_PAY(2),

    /**
     * =================== 支付类型 ====================
     */

    /**
     * 密码支付
     */
    PASSWORD(3),

    /**
     * 指纹支付
     */
    FINGERPRINT(4),

    /**
     * 刷脸支付
     */
    FACE(5);

    private int type;

    public int getType() {
        return type;
    }

    PayTypeEnum(int type) {
        this.type = type;
    }
}
