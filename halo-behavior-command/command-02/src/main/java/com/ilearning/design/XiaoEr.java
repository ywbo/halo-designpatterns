package com.ilearning.design;

import com.ilearning.design.cuisine.ICuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 【命令模式】实现顾客到店点餐，店小二服务顾客并且将菜单给厨师烹饪。
 *
 * @author yuwenbo
 * @date 2022/6/22 6:44
 **/
public class XiaoEr {
    private Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private List<ICuisine> cuisineList = new ArrayList<ICuisine>();

    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder() {
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }
}
