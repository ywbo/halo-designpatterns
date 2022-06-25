package com.ilearning.design.po;

import lombok.Data;

import java.util.Date;

/**
 * 部门
 *
 * @author yuwenbo
 * @date 2022/6/25 15:33
 **/
@Data
public class Department {
    private Integer id;
    private String name;
    private String address;
    private Date createTime;
    private Date updateTime;
}
