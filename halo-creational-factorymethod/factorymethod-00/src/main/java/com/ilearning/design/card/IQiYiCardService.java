package com.ilearning.design.card;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟爱奇艺会员卡服务
 */
public class IQiYiCardService {
    private Logger logger = LoggerFactory.getLogger(IQiYiCardService.class);

    public void grantToken(String bindMobileNumber, String cardId) {
        logger.debug("模拟发放爱奇艺会员卡一张, 绑定手机号：{}，会员卡号：{}", bindMobileNumber, cardId);
    }

}
