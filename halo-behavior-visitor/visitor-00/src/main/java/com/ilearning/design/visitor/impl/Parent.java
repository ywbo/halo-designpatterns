package com.ilearning.design.visitor.impl;

import com.ilearning.design.user.impl.Student;
import com.ilearning.design.user.impl.Teacher;
import com.ilearning.design.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 家长视角
 * <p>
 * 家长关注：自家孩子的排名，老师的班级和教学水平
 *
 * @author yuwenbo
 * @date 2022/6/29 22:49
 **/
public class Parent implements Visitor {

    private Logger logger = LoggerFactory.getLogger(Parent.class);

    @Override
    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{} 排名：{}", student.name, student.clazz, student.ranking());
    }

    @Override
    public void visit(Teacher teacher) {
        logger.info("老师信息 姓名：{} 班级：{} 级别：{}", teacher.name, teacher.clazz, teacher.identity);
    }
}
