package com.ilearning.design;

import lombok.Data;

/**
 * 奖励响应体
 *
 * @author yuwenbo
 * @date 2022/5/26 22:58
 **/
@Data
public class AwardRes {
    private String code; // 编码
    private String info; // 描述

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
