package com.ilearning.design.service.engine.impl;

import com.ilearning.design.model.aggregates.TreeRich;
import com.ilearning.design.model.vo.EngineResult;
import com.ilearning.design.model.vo.TreeNode;
import com.ilearning.design.service.engine.BaseEngine;

import java.util.Map;

/**
 * 规则树引擎处理器
 *
 * @author yuwenbo
 * @date 2022/6/15 6:34
 **/
public class TreeEngineHandler extends BaseEngine {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());

    }
}
