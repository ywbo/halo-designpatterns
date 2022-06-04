package com.ilearning.design.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

/**
 * 创建账户
 *
 * @author yuwenbo
 * @date 2022/6/4 22:53
 **/
@Data
public class CreateAccountMq {
    /**
     * 开户编号
     */
    private String number;

    /**
     * 开户地
     */
    private String address;

    /**
     * 开户时间
     */
    private Date accountDate;

    /**
     * 开户描述
     */
    private String desc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
