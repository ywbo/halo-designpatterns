package com.ilearning.design.enumtype;

/**
 * Redis 枚举类
 *
 * @author yuwenbo
 * @date 2022/5/30 23:09
 **/
public enum RedisTypeEnum {
    /**
     * EGM-redis类型
     */
    EGM_TYPE(1),

    /**
     * IIR-redis类型
     */
    IIR_TYPE(2);

    private Integer redisType;

    public Integer getRedisType() {
        return redisType;
    }

    RedisTypeEnum(Integer redisType) {
        this.redisType = redisType;
    }
}
