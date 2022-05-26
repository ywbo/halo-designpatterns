package com.ilearning.design;

/**
 * 奖励枚举类
 *
 * @author yuwenbo
 * @date 2022/5/26 23:00
 **/
public enum AwardTypeEnum {
    /**
     * 优惠券
     */
    COUPON(1),

    /**
     * 实体商品
     */
    GOODS(2),

    /**
     * 第三方会员卡（爱奇艺）
     */
    CARD(3);

    /**
     * 枚举状态值
     */
    private Integer envState;

    public Integer getEnvState() {
        return envState;
    }

    AwardTypeEnum(Integer envState){
        this.envState = envState;
    }
}
