package com.ilearning.group;

import lombok.Data;

/**
 * 树节点链接
 *
 * @author yuwenbo
 * @date 2022/6/22 23:03
 **/
@Data
public class TreeNodeLink {
    /**
     * 雇员ID
     */
    private String fromId;

    /**
     * 下个目标 ID
     */
    private String toId;

    public TreeNodeLink(String fromId, String toId) {
        this.fromId = fromId;
        this.toId = toId;
    }
}
