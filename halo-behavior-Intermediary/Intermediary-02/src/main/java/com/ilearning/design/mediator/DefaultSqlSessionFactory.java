package com.ilearning.design.mediator;

/**
 * 默认sqlsession工厂
 *
 * @author yuwenbo
 * @date 2022/6/25 14:29
 **/
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration.connection, configuration.mapperElement);
    }
}
