package com.ilearning.design.visitor.impl;

import com.ilearning.design.user.impl.Student;
import com.ilearning.design.user.impl.Teacher;
import com.ilearning.design.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 校长视角
 * <p>
 * 校长关注：学生的名称和班级，老师带班的升学率
 *
 * @author yuwenbo
 * @date 2022/6/29 22:52
 **/
public class Principal implements Visitor {

    private Logger logger = LoggerFactory.getLogger(Principal.class);

    @Override
    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{}", student.name, student.clazz);
    }

    @Override
    public void visit(Teacher teacher) {
        logger.info("学生信息 姓名：{} 班级：{} 升学率：{}", teacher.name, teacher.clazz, teacher.entranceRatio());
    }
}
