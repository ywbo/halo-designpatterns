package com.ilearning.design.event.listener;

import com.ilearning.design.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MQ 事件监听
 *
 * @author yuwenbo
 * @date 2022/6/27 5:41
 **/
public class MQEventListener implements EventListener {

    private Logger logger = LoggerFactory.getLogger(MQEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        logger.info("记录用户 {} 摇号结果。MQ：{}。", result.getUId(), result.getMsg());
    }
}
