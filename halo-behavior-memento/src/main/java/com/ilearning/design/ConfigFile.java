package com.ilearning.design;

import lombok.Data;

import java.util.Date;

/**
 * 配置文件
 *
 * @author yuwenbo
 * @date 2022/6/25 16:49
 **/
@Data
public class ConfigFile {
    /**
     * 版本号
     */
    private String versionNo;

    /**
     * 内容
     */
    private String content;

    /**
     * 时间
     */
    private Date dateTime;

    /**
     * 操作人
     */
    private String operator;

    public ConfigFile(String versionNo, String content, Date dateTime, String operator) {
        this.versionNo = versionNo;
        this.content = content;
        this.dateTime = dateTime;
        this.operator = operator;
    }
}
