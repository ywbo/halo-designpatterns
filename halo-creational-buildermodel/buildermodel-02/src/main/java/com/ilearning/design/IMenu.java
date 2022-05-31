package com.ilearning.design;

/**
 * 装修套餐清单接口
 *
 * @author yuwenbo
 * @date 2022/6/1 5:51
 **/
public interface IMenu {
    /**
     * 吊顶
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();
}
