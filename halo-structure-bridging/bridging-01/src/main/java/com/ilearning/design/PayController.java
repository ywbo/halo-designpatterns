package com.ilearning.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

import static com.ilearning.design.enumtype.PayTypeEnum.*;

/**
 * 非桥接模式实现业务逻辑
 *
 * @author yuwenbo
 * @date 2022/6/10 6:22
 **/
public class PayController {
    private Logger logger = LoggerFactory.getLogger(PayController.class);

    public boolean doPay(String uId, String tradeId, BigDecimal amount, int channelType, int modeType) {
        // 微信支付
        if (WX_PAY.getType() == channelType) {
            logger.info("模拟微信渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            if (PASSWORD.getType() == modeType) {
                logger.info("密码支付，风控校验环境安全");
            } else if (FACE.getType() == modeType) {
                logger.info("人脸支付，风控校验脸部识别");
            } else if (FINGERPRINT.getType() == modeType) {
                logger.info("指纹支付，风控校验指纹信息");
            }
        }
        // 支付宝支付
        else if (ZFB_PAY.getType() == channelType) {
            logger.info("模拟支付宝渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            if (PASSWORD.getType() == modeType) {
                logger.info("密码支付，风控校验环境安全");
            } else if (FACE.getType() == modeType) {
                logger.info("人脸支付，风控校验脸部识别");
            } else if (FINGERPRINT.getType() == modeType) {
                logger.info("指纹支付，风控校验指纹信息");
            }
        }
        return true;
    }
}
