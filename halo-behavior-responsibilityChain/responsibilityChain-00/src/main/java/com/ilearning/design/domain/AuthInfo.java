package com.ilearning.design.domain;

import lombok.Data;

/**
 * 审批详细信息
 *
 * @author yuwenbo
 * @date 2022/6/21 5:44
 **/
@Data
public class AuthInfo {
    private String code;
    private String info = "";

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String info : infos) {
            this.info = this.info.concat(info);
        }
    }
}
