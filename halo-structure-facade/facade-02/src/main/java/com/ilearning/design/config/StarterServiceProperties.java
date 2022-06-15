package com.ilearning.design.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 切面定义
 *
 * @author yuwenbo
 * @date 2022/6/16 7:00
 */
@ConfigurationProperties("halo.door")
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }

}
