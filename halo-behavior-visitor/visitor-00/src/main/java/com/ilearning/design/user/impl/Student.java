package com.ilearning.design.user.impl;

import com.ilearning.design.user.User;
import com.ilearning.design.visitor.Visitor;

/**
 * 学生信息类
 *
 * @author yuwenbo
 * @date 2022/6/29 22:36
 **/
public class Student extends User {
    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }
}
