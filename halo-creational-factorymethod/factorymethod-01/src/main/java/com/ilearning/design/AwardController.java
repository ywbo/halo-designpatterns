package com.ilearning.design;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.card.IQiYiCardService;
import com.ilearning.design.coupon.CouponResult;
import com.ilearning.design.coupon.CouponService;
import com.ilearning.design.goods.DeliverReq;
import com.ilearning.design.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.ilearning.design.enumtype.AwardTypeEnum.*;

/**
 * 奖励业务了逻辑处理
 *
 * @author yuwenbo
 * @date 2022/5/26 22:59
 **/
public class AwardController {
    /**
     * 日志
     */
    private final Logger logger = LoggerFactory.getLogger(AwardController.class);

    public AwardRes getAwrad2User(AwardReq req){
        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes = null;
        logger.debug("奖品开始发放啦{}。req:{}", req.getUId(), reqJson);
        // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
        try {
            if (COUPON.getEnvState().equals(req.getAwardType())){
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getUId(), req.getAwardNumber(), req.getBizId());
                if ("0000".equals(couponResult.getCode())) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", couponResult.getInfo());
                }
            } else if (GOODS.getEnvState().equals(req.getAwardType())){
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getUId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(req.getUId()));
                deliverReq.setSku(req.getAwardNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if (isSuccess) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", "发放失败");
                }
            } else if (CARD.getEnvState().equals(req.getAwardType())) {
                String bindMobileNumber = queryUserPhoneNumber(req.getUId());
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(bindMobileNumber, req.getAwardNumber());
                awardRes = new AwardRes("0000", "发放成功");
            }
            logger.info("奖品发放完成{}。", req.getUId());
        } catch (Exception e) {
            logger.error("奖品发放失败{}。req:{}", req.getUId(), reqJson, e);
            awardRes = new AwardRes("0001", e.getMessage());
        }
        return awardRes;

    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }

}
