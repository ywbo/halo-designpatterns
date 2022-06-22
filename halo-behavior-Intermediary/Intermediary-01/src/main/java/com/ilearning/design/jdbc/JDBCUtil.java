package com.ilearning.design.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * 手写JDBC连接
 *
 * @author yuwenbo
 * @date 2022/6/23 6:15
 **/
public class JDBCUtil {

    private static Logger logger = LoggerFactory.getLogger(JDBCUtil.class);

    /**
     * 定义数据库链接
     * 以 MySQL 为例
     */
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/halo_pattern";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 加载数据库驱动
        Class.forName("com.mysql.cj.jdbc.driver");

        // 2. 获取数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

        // 3. 操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT id, name, age, createTime, updateTime FROM t_user");

        // 如果有数据，resultSet.next() 返回 ture
        while (resultSet.next()) {
            logger.info("测试结果 姓名：{} 年龄：{}", resultSet.getString("name"), resultSet.getInt("age"));
        }
    }

}
