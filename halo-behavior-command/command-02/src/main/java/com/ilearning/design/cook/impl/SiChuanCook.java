package com.ilearning.design.cook.impl;

import com.ilearning.design.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 四川（传）菜烹饪
 *
 * @author yuwenbo
 * @date 2022/6/22 6:55
 */
public class SiChuanCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("是中国传统四大菜系之一，川菜取材广泛，调味多变，菜式多样，口味清鲜醇浓并重，以善用麻辣调味著称，并以其别具一格的烹调方法和浓郁的地方风味，融会了东南西北各方的特点，博采众家之长，善于吸收，善于创新，享誉中外。");
    }

}
