package com.ilearning.design;

import com.ilearning.design.event.EventManager;
import com.ilearning.design.event.listener.MQEventListener;
import com.ilearning.design.event.listener.MessageEventListener;

/**
 * 【观察者】摇号接口
 *
 * @author yuwenbo
 * @date 2022/6/26 23:19
 **/
public abstract class LotteryService {

    private EventManager eventManager;

    public LotteryService() {
        EventManager manager = new EventManager(EventManager.EventEnum.MQ, EventManager.EventEnum.MESSAGE);
        manager.subscribe(EventManager.EventEnum.MQ, new MQEventListener());
        manager.subscribe(EventManager.EventEnum.MESSAGE, new MessageEventListener());
    }

    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);
        // 需要什么通知，就调用什么方法
        eventManager.notify(EventManager.EventEnum.MQ, lotteryResult);
        eventManager.notify(EventManager.EventEnum.MESSAGE, lotteryResult);
        return lotteryResult;
    }

    protected abstract LotteryResult doDraw(String uId);

}
