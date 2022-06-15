package com.ilearning.design.config;

/**
 * 切面定义
 *
 * @author yuwenbo
 * @date 2022/6/16 7:00
 */
public class StarterService {

    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return userStr.split(separatorChar);
    }

}
