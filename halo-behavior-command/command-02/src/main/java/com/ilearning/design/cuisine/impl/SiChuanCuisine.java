package com.ilearning.design.cuisine.impl;

import com.ilearning.design.cook.ICook;
import com.ilearning.design.cuisine.ICuisine;

/**
 * 四川（川）菜系
 *
 * @author yuwenbo
 * @date 2022/6/22 6:56
 */
public class SiChuanCuisine implements ICuisine {

    private ICook cook;

    public SiChuanCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }

}