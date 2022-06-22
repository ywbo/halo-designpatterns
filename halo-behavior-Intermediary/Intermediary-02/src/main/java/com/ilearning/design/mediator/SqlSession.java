package com.ilearning.design.mediator;

import java.util.List;

/**
 * SqlSession
 *
 * @author yuwenbo
 * @date 2022/6/23 6:59
 **/
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();

}
