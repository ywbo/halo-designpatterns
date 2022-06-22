package com.ilearning.design.mediator;

import java.sql.Connection;
import java.util.Map;

/**
 * 根配置类
 *
 * @author yuwenbo
 * @date 2022/6/23 6:37
 **/
public class Configuration {
    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, XMLNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XMLNode> mapperElement) {
        this.mapperElement = mapperElement;
    }
}
