package com.ilearning.design;

import lombok.Data;

import java.util.Date;

/**
 * 回扣消息
 *
 * @author yuwenbo
 * @date 2022/6/4 23:20
 **/
@Data
public class RebateInfo {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 业务ID
     */
    private String bizId;

    /**
     * 业务时间
     */
    private Date bizTime;

    /**
     * 业务描述
     */
    private String desc;
}
