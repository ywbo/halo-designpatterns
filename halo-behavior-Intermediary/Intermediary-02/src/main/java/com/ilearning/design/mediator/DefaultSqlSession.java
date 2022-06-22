package com.ilearning.design.mediator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.Date;
import java.util.*;

/**
 * 实现 SqlSession 接口
 *
 * @author yuwenbo
 * @date 2022/6/23 7:03
 **/
public class DefaultSqlSession implements SqlSession {

    private Connection connection;

    private Map<String, XMLNode> mapperElement;

    public DefaultSqlSession(Connection connection, Map<String, XMLNode> mapperElement) {
        this.connection = connection;
        this.mapperElement = mapperElement;
    }

    @Override
    public <T> T selectOne(String statement) {
        XMLNode xmlNode = mapperElement.get(statement);
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(xmlNode.getSql());
            ResultSet resultSet = preparedStatement.executeQuery();
            List<T> objects = resultSet2Obj(resultSet, Class.forName(xmlNode.getResultType()));
            return objects.get(0);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        return null;
    }

    @Override
    public <T> List<T> selectList(String statement) {
        return null;
    }

    @Override
    public <T> List<T> selectList(String statement, Object parameter) {
        return null;
    }

    @Override
    public void close() {

    }

    private <T> List<T> resultSet2Obj(ResultSet resultSet, Class<?> clazz) {
        List<T> list = new ArrayList<>();
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            // 每次遍历行值
            while (resultSet.next()) {
                T obj = (T) clazz.newInstance();
                for (int i = 1; i <= columnCount; i++) {
                    Object value = resultSet.getObject(i);
                    String columnName = metaData.getColumnName(i);
                    String setMethod = "set" + columnName.substring(0, 1).toUpperCase(Locale.ROOT) + columnName.substring(1);
                    Method method;
                    if (value instanceof Timestamp) {
                        method = clazz.getMethod(setMethod, Date.class);
                    } else {
                        method = clazz.getMethod(setMethod, value.getClass());
                    }
                    method.invoke(obj, value);
                }
                list.add(obj);
            }
        } catch (SQLException | InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return list;
    }
}
