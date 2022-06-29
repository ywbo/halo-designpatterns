package com.ilearning.design.user;

import com.ilearning.design.visitor.Visitor;
import lombok.Data;

/**
 * 用户信息抽象类
 *
 * @author yuwenbo
 * @date 2022/6/29 22:34
 **/
@Data
public abstract class User {
    /**
     * 姓名
     */
    public String name;

    /**
     * 身份；重点班、普通班 | 特级教师、普通教师、实习教师
     */
    public String identity;

    /**
     * 班级
     */
    public String clazz;

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    /**
     * 核心访问方法
     *
     * @param visitor 访问者
     */
    public abstract void accept(Visitor visitor);
}
