package com.ilearning.design.dao;

import com.ilearning.design.po.User;

/**
 * 用户dao
 *
 * @author yuwenbo
 * @date 2022/6/23 6:38
 **/
public interface UserDao {
    User queryUserById(Integer id);
}
