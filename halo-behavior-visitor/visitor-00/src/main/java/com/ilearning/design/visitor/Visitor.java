package com.ilearning.design.visitor;

import com.ilearning.design.user.impl.Student;
import com.ilearning.design.user.impl.Teacher;

/**
 * 【访问者模式】访问接口
 *
 * @author yuwenbo
 * @date 2022/6/29 22:35
 **/
public interface Visitor {
    /**
     * 访问学生信息
     *
     * @param student
     */
    void visit(Student student);

    /**
     * 访问老师信息
     *
     * @param teacher
     */
    void visit(Teacher teacher);
}
