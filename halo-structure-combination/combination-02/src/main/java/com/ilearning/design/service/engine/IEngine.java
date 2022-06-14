package com.ilearning.design.service.engine;

import com.ilearning.design.model.aggregates.TreeRich;
import com.ilearning.design.model.vo.EngineResult;

import java.util.Map;

/**
 * 决策引擎接口
 *
 * @author yuwenbo
 * @date 2022/6/15 6:08
 **/
public interface IEngine {
    EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

}
