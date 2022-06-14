package com.ilearning.design.service.engine;

import com.ilearning.design.model.aggregates.TreeRich;
import com.ilearning.design.model.vo.EngineResult;
import com.ilearning.design.model.vo.TreeNode;
import com.ilearning.design.model.vo.TreeRoot;
import com.ilearning.design.service.logic.LogicFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 基础决策引擎
 *
 * @author yuwenbo
 * @date 2022/6/15 6:11
 **/
public abstract class BaseEngine extends EngineConfig implements IEngine {
    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(BaseEngine.class);

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        // 规则树根 ID
        Long treeRootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(treeRootNodeId);
        // 节点类型 [NodeType]; 1-子叶，2-果实
        while (treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNodeInfo;
    }
}
