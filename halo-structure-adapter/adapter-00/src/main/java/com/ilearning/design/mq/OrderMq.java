package com.ilearning.design.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

@Data
public class OrderMq {

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 商品
     */
    private String sku;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 下单时间
     */
    private Date createOrderTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
