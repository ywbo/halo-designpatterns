package com.ilearning.design.enumtype;

/**
 * 建造者模式枚举类
 *
 * @author yuwenbo
 * @date 2022/5/31 23:12
 **/
public enum BuilderTypeEnum {
    /**
     * 1: 豪华欧式
     */
    LUXURY_EUROPEAN(1),

    /**
     * 2: 轻奢田园
     */
    LIGHT_LUXURY_GARDEN(2),

    /**
     * 3: 现代简约
     */
    MODERN_SIMPLIFY(3);

    /**
     * 装修风格样式
     */
    private Integer styleType;

    public Integer getStyleType() {
        return styleType;
    }

    BuilderTypeEnum(Integer styleType) {
        this.styleType = styleType;
    }
}
