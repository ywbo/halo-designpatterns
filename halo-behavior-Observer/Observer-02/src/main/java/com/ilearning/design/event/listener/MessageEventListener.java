package com.ilearning.design.event.listener;

import com.ilearning.design.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 短信 事件监听
 *
 * @author yuwenbo
 * @date 2022/6/27 5:42
 **/
public class MessageEventListener implements EventListener {
    private Logger logger = LoggerFactory.getLogger(MessageEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        logger.info("给用户 {} 发送短信通知。短信：{}。", result.getUId(), result.getMsg());
    }
}
