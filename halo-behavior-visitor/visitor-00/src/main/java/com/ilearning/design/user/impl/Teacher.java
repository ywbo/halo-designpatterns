package com.ilearning.design.user.impl;

import com.ilearning.design.user.User;
import com.ilearning.design.visitor.Visitor;

import java.math.BigDecimal;

/**
 * 老师信息
 *
 * @author yuwenbo
 * @date 2022/6/29 22:41
 **/
public class Teacher extends User {
    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 升学率
    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
