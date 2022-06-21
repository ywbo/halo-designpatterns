package com.ilearning.design.cuisine.impl;

import com.ilearning.design.cook.ICook;
import com.ilearning.design.cuisine.ICuisine;

/**
 * 广东（粤）菜系
 *
 * @author yuwenbo
 * @date 2022/6/22 6:47
 **/
public class GuangDongCuisine implements ICuisine {

    private ICook cook;

    public GuangDongCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
