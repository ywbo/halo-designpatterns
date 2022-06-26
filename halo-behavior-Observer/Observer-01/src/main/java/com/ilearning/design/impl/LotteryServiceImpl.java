package com.ilearning.design.impl;

import com.ilearning.design.CarTargetService;
import com.ilearning.design.LotteryResult;
import com.ilearning.design.LotteryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * 调整服务实现类
 *
 * @author yuwenbo
 * @date 2022/6/26 23:00
 **/
public class LotteryServiceImpl implements LotteryService {

    private Logger logger = LoggerFactory.getLogger(LotteryServiceImpl.class);

    private CarTargetService carTargetService = new CarTargetService();

    @Override
    public LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = carTargetService.lottery(uId);

        // 发短信
        logger.info("给用户 {} 发短信通知（短信）：{}。", uId, lottery);

        // 发 MQ消息
        logger.info("记录用户 {} 的摇号结果（MQ）。", uId, lottery);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
