package com.ilearning.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 管理员
 *
 * @author yuwenbo
 * @date 2022/6/25 16:49
 **/
public class Admin {
    private int cursorIds = 0;
    private List<ConfigMemento> mementoList = new ArrayList<>();
    private Map<String, ConfigMemento> mementoMap = new ConcurrentHashMap<>();

    public void append(ConfigMemento memento) {
        mementoList.add(memento);
        mementoMap.put(memento.getConfigFile().getVersionNo(), memento);
        cursorIds++;
    }

    public ConfigMemento undo() {
        if (--cursorIds <= 0) {
            return mementoList.get(0);
        }
        return mementoList.get(cursorIds);
    }

    public ConfigMemento redo() {
        if (++cursorIds >= mementoList.size()) {
            return mementoList.get(mementoList.size() - 1);
        }
        return mementoList.get(cursorIds);
    }

    public ConfigMemento get(String versionNo) {
        return mementoMap.get(versionNo);
    }
}
