package com.ilearning.design.model.vo;

import lombok.Data;

/**
 * 规则树根信息
 *
 * @author yuwenbo
 * @date 2022/6/15 6:06
 **/
@Data
public class TreeRoot {
    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 规则树根ID
     */
    private Long treeRootNodeId;

    /**
     * 规则树名称
     */
    private String treeName;

}
