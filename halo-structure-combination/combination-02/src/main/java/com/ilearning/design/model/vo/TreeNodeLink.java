package com.ilearning.design.model.vo;

import lombok.Data;

/**
 * 规则树线信息
 *
 * @author yuwenbo
 * @date 2022/6/15 6:05
 **/
@Data
public class TreeNodeLink {
    /**
     * 节点From
     */
    private Long nodeIdFrom;

    /**
     * 节点To
     */
    private Long nodeIdTo;

    /**
     * 限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
     */
    private Integer ruleLimitType;

    /**
     * 限定值
     */
    private String ruleLimitValue;

}
