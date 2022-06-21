package com.ilearning.design.cook.impl;

import com.ilearning.design.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 广东（粤）菜烹饪
 *
 * @author yuwenbo
 * @date 2022/6/22 6:51
 **/
public class GuangDongCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("是中国传统四大菜系、八大菜系之一，以烹制海鲜见长，汤类、素菜、甜菜最具特色。");
    }
}
