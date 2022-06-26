package com.ilearning.design;

import lombok.Data;

import java.util.Date;

/**
 * 摇号结果
 *
 * @author yuwenbo
 * @date 2022/6/26 22:53
 **/
@Data
public class LotteryResult {
    /**
     * 用户ID
     */
    private String uId;

    /**
     * 摇号信息
     */
    private String msg;

    /**
     * 业务时间
     */
    private Date dateTime;

    public LotteryResult(String uId, String msg, Date dateTime) {
        this.uId = uId;
        this.msg = msg;
        this.dateTime = dateTime;
    }
}
