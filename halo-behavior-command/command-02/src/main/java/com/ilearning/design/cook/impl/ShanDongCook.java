package com.ilearning.design.cook.impl;

import com.ilearning.design.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 山东（鲁）菜烹饪
 *
 * @author yuwenbo
 * @date 2022/6/22 6:54
 */
public class ShanDongCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("是中国传统四大菜系之一，是历史最悠久、技法最丰富、难度最高、最见功力的菜系。");
    }

}
