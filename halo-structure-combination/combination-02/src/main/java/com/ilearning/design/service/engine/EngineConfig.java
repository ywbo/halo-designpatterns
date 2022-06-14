package com.ilearning.design.service.engine;

import com.ilearning.design.service.logic.LogicFilter;
import com.ilearning.design.service.logic.impl.UserAgeFilter;
import com.ilearning.design.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 引擎配置
 *
 * @author yuwenbo
 * @date 2022/6/15 6:12
 **/
public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        this.logicFilterMap = logicFilterMap;
    }

}
