package com.ilearning.design.model.vo;

import lombok.Data;

import java.util.List;

/**
 * 规则树节点信息
 *
 * @author yuwenbo
 * @date 2022/6/15 6:02
 **/
@Data
public class TreeNode {
    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 规则树节点ID
     */
    private Long treeNodeId;

    /**
     * 节点类型；1子叶、2果实
     */
    private Integer nodeType;

    /**
     * 节点值[nodeType=2]；果实值
     */
    private String nodeValue;

    /**
     * 规则Key
     */
    private String ruleKey;

    /**
     * 规则描述
     */
    private String ruleDesc;

    /**
     * 节点链路
     */
    private List<TreeNodeLink> treeNodeLinkList;

}
