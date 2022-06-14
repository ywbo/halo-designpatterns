package com.ilearning.design.model.vo;

import lombok.Data;

/**
 * 引擎返回决策结果
 *
 * @author yuwenbo
 * @date 2022/6/15 5:58
 **/
@Data
public class EngineResult {
    /**
     * 执行结果
     */
    private boolean isSuccess;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 果实节点ID
     */
    private Long nodeId;

    /**
     * 果实节点值
     */
    private String nodeValue;

    public EngineResult() {
    }

    public EngineResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }
}
