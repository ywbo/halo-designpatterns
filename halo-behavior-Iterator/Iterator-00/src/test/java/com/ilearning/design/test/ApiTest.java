package com.ilearning.design.test;

import com.ilearning.design.Iterator;
import com.ilearning.group.Employee;
import com.ilearning.group.GroupStructure;
import com.ilearning.group.TreeNodeLink;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 【迭代器模式】测试类
 *
 * @author yuwenbo
 * @date 2022/6/23 5:40
 **/
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_iterator() {
        GroupStructure groupStructure = new GroupStructure("1", "小傅哥");
        groupStructure.add(new Employee("2", "花花", "二级部门"));
        groupStructure.add(new Employee("3", "豆包", "二级部门"));
        groupStructure.add(new Employee("4", "蹦蹦", "三级部门"));
        groupStructure.add(new Employee("5", "大烧", "三级部门"));
        groupStructure.add(new Employee("6", "虎哥", "四级部门"));
        groupStructure.add(new Employee("7", "玲姐", "四级部门"));
        groupStructure.add(new Employee("8", "秋雅", "四级部门"));

        groupStructure.addLink("1", new TreeNodeLink("1", "2"));
        groupStructure.addLink("1", new TreeNodeLink("1", "3"));

        groupStructure.addLink("2", new TreeNodeLink("2", "4"));
        groupStructure.addLink("2", new TreeNodeLink("2", "5"));

        groupStructure.addLink("5", new TreeNodeLink("5", "6"));
        groupStructure.addLink("5", new TreeNodeLink("5", "7"));
        groupStructure.addLink("5", new TreeNodeLink("5", "8"));

        Iterator<Employee> iterator = groupStructure.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            logger.info("{}，雇员 Id：{} Name：{}", employee.getDesc(), employee.getUId(), employee.getName());
        }

    }
}
