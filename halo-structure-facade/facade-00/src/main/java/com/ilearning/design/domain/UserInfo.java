package com.ilearning.design.domain;

import lombok.Data;

/**
 * 用户信息
 *
 * @author yuwenbo
 * @date 2022/6/16 6:08
 **/
@Data
public class UserInfo extends CodeInfo {

    private CodeInfo codeInfo;
    private String name;
    private Integer age;
    private String address;

    public UserInfo() {
    }

    public UserInfo(String name, Integer age, String address) {
        codeInfo = codeInfo;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
