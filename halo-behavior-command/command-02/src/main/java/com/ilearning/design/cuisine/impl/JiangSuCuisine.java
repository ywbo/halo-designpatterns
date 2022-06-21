package com.ilearning.design.cuisine.impl;

import com.ilearning.design.cook.ICook;
import com.ilearning.design.cuisine.ICuisine;

/**
 * 江苏（苏）菜系
 *
 * @author yuwenbo
 * @date 2022/6/22 6:53
 **/
public class JiangSuCuisine implements ICuisine {
    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
