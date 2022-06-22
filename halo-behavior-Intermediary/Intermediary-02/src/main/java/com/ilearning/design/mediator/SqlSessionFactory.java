package com.ilearning.design.mediator;

/**
 * SqlSession 工厂
 *
 * @author yuwenbo
 * @date 2022/6/23 7:04
 **/
public interface SqlSessionFactory {
    SqlSession openSession();
}
