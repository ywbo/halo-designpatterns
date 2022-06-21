package com.ilearning.design.cook.impl;

import com.ilearning.design.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 江苏（苏）菜烹饪
 *
 * @author yuwenbo
 * @date 2022/6/22 6:54
 **/
public class JiangSuCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("是中国传统四大菜系之一，苏菜擅长炖、焖、蒸、炒，重视调汤，保持原汁，风味清鲜，浓而不腻，淡而不薄，酥松脱骨而不失其形，滑嫩爽脆而不失其味。");
    }
}
