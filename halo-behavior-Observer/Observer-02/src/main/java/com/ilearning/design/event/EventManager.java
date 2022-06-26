package com.ilearning.design.event;

import com.ilearning.design.LotteryResult;
import com.ilearning.design.event.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件管理器
 *
 * @author yuwenbo
 * @date 2022/6/26 23:21
 **/
public class EventManager {
    Map<Enum<EventEnum>, List<EventListener>> listeners = new HashMap<>();

    public EventManager(Enum<EventEnum>... operations) {
        for (Enum<EventEnum> operation : operations) {
            listeners.put(operation, new ArrayList<>());
        }
    }

    public enum EventEnum {
        MQ, MESSAGE
    }

    /**
     * 订阅
     *
     * @param eventEnum 事件类型
     * @param listener  监听器
     */
    public void subscribe(EventEnum eventEnum, EventListener listener) {
        List<EventListener> users = listeners.get(eventEnum);
        users.add(listener);
    }

    /**
     * 取消订阅
     *
     * @param eventEnum 事件类型
     * @param listener  监听器
     */
    public void unSubscribe(EventEnum eventEnum, EventListener listener) {
        List<EventListener> users = listeners.get(eventEnum);
        users.remove(listener);
    }

    /**
     * 消息通知
     *
     * @param eventType 事件类型
     * @param result    结果
     */
    public void notify(EventEnum eventType, LotteryResult result) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.doEvent(result);
        }
    }

}
