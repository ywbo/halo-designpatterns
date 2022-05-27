package com.ilearning.design;

import com.ilearning.design.commodity.ICommodity;
import com.ilearning.design.commodity.impl.CardServiceImpl;
import com.ilearning.design.commodity.impl.CouponServiceImpl;
import com.ilearning.design.commodity.impl.GoodsServiceImpl;

import static com.ilearning.design.enumtype.AwardTypeEnum.*;

/**
 * 奖励发放工厂类
 *
 * @author yuwenbo
 * @date 2022/5/27 22:54
 **/
public class AwardFactory {
    public ICommodity getAwardService(Integer awardType) {
        if (null == awardType) {
            return null;
        }
        if (COUPON.getEnvState().equals(awardType)) {
            return new CouponServiceImpl();
        }
        if (GOODS.getEnvState().equals(awardType)) {
            return new GoodsServiceImpl();
        }
        if (CARD.getEnvState().equals(awardType)) {
            return new CardServiceImpl();
        }
        throw new RuntimeException("该商品类型不存在！");
    }
}
