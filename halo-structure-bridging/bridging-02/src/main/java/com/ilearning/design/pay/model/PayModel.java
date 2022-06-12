package com.ilearning.design.pay.model;

/**
 * 支付接口
 *
 * @author yuwenbo
 * @date 2022/6/12 17:29
 **/
public interface PayModel {
    boolean security(String uId);
}
