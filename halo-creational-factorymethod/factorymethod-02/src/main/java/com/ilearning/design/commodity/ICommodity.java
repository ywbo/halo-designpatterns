package com.ilearning.design.commodity;

import java.util.Map;

/**
 * 商品公共接口类
 *
 * @author yuwenbo
 * @date 2022/5/27 23:03
 **/
public interface ICommodity {
    void sendAward(String uId, String awardNum, String bizId, Map<String, String> extMap);
}
