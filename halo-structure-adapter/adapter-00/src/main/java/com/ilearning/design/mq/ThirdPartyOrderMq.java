package com.ilearning.design.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 第三方订单
 *
 * @author yuwenbo
 * @date 2022/6/4 22:58
 **/
@Data
public class ThirdPartyOrderMq {
    /**
     * 用户ID
     */
    private String uId;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 商品
     */
    private Date sku;

    /**
     * 商品名称
     */
    private Date skuName;

    /**
     * 金额
     */
    private BigDecimal decimal;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
