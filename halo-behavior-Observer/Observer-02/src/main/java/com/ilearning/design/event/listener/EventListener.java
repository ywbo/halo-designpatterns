package com.ilearning.design.event.listener;

import com.ilearning.design.LotteryResult;

/**
 * 事件监听器
 *
 * @author yuwenbo
 * @date 2022/6/26 23:27
 **/
public interface EventListener {

    void doEvent(LotteryResult result);

}
