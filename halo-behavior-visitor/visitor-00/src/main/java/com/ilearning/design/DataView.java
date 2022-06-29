package com.ilearning.design;

import com.ilearning.design.user.User;
import com.ilearning.design.user.impl.Student;
import com.ilearning.design.user.impl.Teacher;
import com.ilearning.design.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据展示层
 *
 * @author yuwenbo
 * @date 2022/6/29 22:43
 **/
public class DataView {
    List<User> userList = new ArrayList<User>();

    public DataView() {
        userList.add(new Student("谢飞机", "重点班", "一年一班"));
        userList.add(new Student("windy", "重点班", "一年一班"));
        userList.add(new Student("大毛", "普通班", "二年三班"));
        userList.add(new Student("Shing", "普通班", "三年四班"));
        userList.add(new Teacher("BK", "特级教师", "一年一班"));
        userList.add(new Teacher("娜娜Goddess", "特级教师", "一年一班"));
        userList.add(new Teacher("dangdang", "普通教师", "二年三班"));
        userList.add(new Teacher("泽东", "实习教师", "三年四班"));
    }

    // 展示
    public void show(Visitor visitor) {
        for (User user : userList) {
            user.accept(visitor);
        }
    }
}
