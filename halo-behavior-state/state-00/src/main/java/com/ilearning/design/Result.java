package com.ilearning.design;

import lombok.Data;

/**
 * 返回的对象
 *
 * @author yuwenbo
 * @date 2022/6/28 5:58
 **/
@Data
public class Result {
    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String info;

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
