package com.ilearning.design.commodity.impl;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.card.IQiYiCardService;
import com.ilearning.design.commodity.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 爱奇艺会员兑换卡
 *
 * @author yuwenbo
 * @date 2022/5/27 23:08
 **/
public class CardServiceImpl implements ICommodity {
    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);

    private IQiYiCardService cardService = new IQiYiCardService();

    @Override
    public void sendAward(String uId, String awardNum, String bizId, Map<String, String> extMap) {
        String mobile = queryUserMobile(uId);
        cardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{}, awardNum：{}, bizId：{}, extMap：{}", uId, awardNum, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：恭喜你，兑换成功！");
    }

    private String queryUserMobile(String uId) {
        return "15300002222";
    }
}
