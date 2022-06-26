package com.ilearning.design.event;

import com.ilearning.design.enumtype.EventEnum;
import com.ilearning.design.event.listener.EventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 事件管理器
 *
 * @author yuwenbo
 * @date 2022/6/26 23:21
 **/
public class EventManager {
    Map<Enum<EventEnum>, List<EventListener>> listener = new ConcurrentHashMap<>();

    public EventManager(Enum<EventEnum>... operations) {
        for (Enum<EventEnum> operation : operations) {
            listener.put(operation, new ArrayList<>());
        }
    }

    
}
