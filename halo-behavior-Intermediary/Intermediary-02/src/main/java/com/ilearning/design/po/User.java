package com.ilearning.design.po;

import lombok.Data;

import java.util.Date;

/**
 * 用户信息
 *
 * @author yuwenbo
 * @date 2022/6/23 6:37
 **/
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Date createTime;
    private Date updateTime;
}
