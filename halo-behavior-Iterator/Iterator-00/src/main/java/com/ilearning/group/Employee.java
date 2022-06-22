package com.ilearning.group;

import lombok.Data;

/**
 * 公司雇员
 *
 * @author yuwenbo
 * @date 2022/6/22 23:02
 **/
@Data
public class Employee {
    /**
     * ID
     */
    private String uId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 备注
     */
    private String desc;

    public Employee(String uId, String name) {
        this.uId = uId;
        this.name = name;
    }

    public Employee(String uId, String name, String desc) {
        this.uId = uId;
        this.name = name;
        this.desc = desc;
    }
}
