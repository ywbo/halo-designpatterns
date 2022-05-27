package com.ilearning.design.commodity.impl;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.commodity.ICommodity;
import com.ilearning.design.goods.DeliverReq;
import com.ilearning.design.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 实体商品
 *
 * @author yuwenbo
 * @date 2022/5/27 23:08
 **/
public class GoodsServiceImpl implements ICommodity {
    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);

    private GoodsService goodsService = new GoodsService();

    @Override
    public void sendAward(String uId, String awardNum, String bizId, Map<String, String> extMap) {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNum(uId));
        deliverReq.setSku(awardNum);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[优惠券] => uId：{}, awardNum：{}, bizId：{}, extMap：{}", uId, awardNum, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);

        if (!isSuccess) throw new RuntimeException("实物商品发放失败");
    }

    private String queryUserPhoneNum(String uId) {
        return "15300002222";
    }

    private String queryUserName(String uId) {
        return "Milor";
    }
}
