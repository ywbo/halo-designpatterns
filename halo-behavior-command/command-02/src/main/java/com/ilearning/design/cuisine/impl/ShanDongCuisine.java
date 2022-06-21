package com.ilearning.design.cuisine.impl;

import com.ilearning.design.cook.ICook;
import com.ilearning.design.cuisine.ICuisine;

/**
 * 山东（鲁）菜系
 *
 * @author yuwenbo
 * @date 2022/6/22 6:55
 */
public class ShanDongCuisine implements ICuisine {

    private ICook cook;

    public ShanDongCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }

}