package com.ilearning.design.dao;

import com.ilearning.design.po.Department;

/**
 * 部门信息数据层
 *
 * @author yuwenbo
 * @date 2022/6/25 15:35
 **/
public interface DepartmentDao {
    Department queryDepartmentById(Integer id);
}
