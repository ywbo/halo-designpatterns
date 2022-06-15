package com.ilearning.design.domain;

import lombok.Data;

/**
 * CodeInfo
 *
 * @author yuwenbo
 * @date 2022/6/16 6:17
 **/
@Data
public class CodeInfo {
    private String code;
    private String info;

    public CodeInfo() {
    }

    public CodeInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
