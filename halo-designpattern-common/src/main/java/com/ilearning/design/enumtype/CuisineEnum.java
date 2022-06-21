package com.ilearning.design.enumtype;

/**
 * 【命令模式】菜系枚举
 *
 * @author yuwenbo
 * @date 2022/6/22 6:20
 **/
public enum CuisineEnum {
    /**
     * 广东（粤菜）
     */
    YUECAI(1),

    /**
     * 苏州（苏菜）
     */
    SUCAI(2),

    /**
     * 山东（鲁菜）
     */
    LUCAI(3),

    /**
     * 四川（川菜）
     */
    CHUANCAI(4);

    /**
     * 菜系
     */
    private int cuisine;

    public int getCuisine() {
        return cuisine;
    }

    CuisineEnum(int cuisine) {
        this.cuisine = cuisine;
    }
}
