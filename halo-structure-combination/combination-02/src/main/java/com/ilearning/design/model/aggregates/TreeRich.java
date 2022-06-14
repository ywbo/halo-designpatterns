package com.ilearning.design.model.aggregates;

import com.ilearning.design.model.vo.TreeNode;
import com.ilearning.design.model.vo.TreeRoot;
import lombok.Data;

import java.util.Map;

/**
 * 聚合规则树
 *
 * @author yuwenbo
 * @date 2022/6/15 5:55
 **/
@Data
public class TreeRich {
    /**
     * 树根信息
     */
    private TreeRoot treeRoot;

    /**
     * 树节点ID -> 子节点
     */
    private Map<Long, TreeNode> treeNodeMap;

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }
}
