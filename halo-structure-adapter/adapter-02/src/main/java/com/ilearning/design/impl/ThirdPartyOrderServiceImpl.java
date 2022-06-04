package com.ilearning.design.impl;

import com.ilearning.design.OrderAdapterService;
import com.ilearning.design.service.ThirdPartyOrderService;

/**
 * 第三方订单信息
 *
 * @author yuwenbo
 * @date 2022/6/4 23:26
 **/
public class ThirdPartyOrderServiceImpl implements OrderAdapterService {
    
    private ThirdPartyOrderService thirdPartyOrderService = new ThirdPartyOrderService();

    @Override
    public boolean isFirst(String uId) {
        return thirdPartyOrderService.isFirstOrder(uId);
    }
}
