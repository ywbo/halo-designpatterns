package com.ilearning.design.mediator;

import org.apache.ibatis.builder.xml.XMLMapperEntityResolver;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * SqlSession 工厂构建
 *
 * @author yuwenbo
 * @date 2022/6/23 6:57
 **/
public class SqlSessionFactoryBuilder {
    public DefaultSqlSessionFactory build(Reader reader) {
        SAXReader saxReader = new SAXReader();
        saxReader.setEntityResolver(new XMLMapperEntityResolver());
        try {
            Document document = saxReader.read(new InputSource(reader));
            Configuration configuration = parseConfiguration(document.getRootElement());
            return new DefaultSqlSessionFactory(configuration);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解析配置文件
     *
     * @param rootElement 根元素
     * @return 配置文件
     */
    private Configuration parseConfiguration(Element rootElement) {
        Configuration configuration = new Configuration();
        configuration.setDataSource(dataSource(rootElement.selectNodes("//dataSource")));
        configuration.setConnection(connection(configuration.dataSource));
        configuration.setMapperElement(mapperElement(rootElement.selectNodes("mappers")));
        return configuration;
    }

    /**
     * 获取数据源
     *
     * @param list 已选择节点
     * @return 数据源配置信息
     */
    private Map<String, String> dataSource(List<Element> list) {
        Map<String, String> dataSource = new HashMap<>(4);
        Element element = list.get(0);
        List content = element.content();
        for (Object o : content) {
            Element ele = (Element) o;
            String name = ele.attributeValue("name");
            String value = ele.attributeValue("value");
            dataSource.put(name, value);
        }
        return dataSource;
    }

    /**
     * 获取数据库连接
     *
     * @param dataSource 数据源
     * @return 数据库连接
     */
    private Connection connection(Map<String, String> dataSource) {
        try {
            Class.forName(dataSource.get("driver"));
            DriverManager.getConnection(dataSource.get("url"), dataSource.get("username"), dataSource.get("password"));
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取SQL语句信息
     *
     * @param mappers 映射器
     * @return 映射器元素
     */
    private Map<String, XMLNode> mapperElement(List<Element> mappers) {
        Map<String, XMLNode> map = new HashMap<>();
        Element element = mappers.get(0);
        List content = element.content();
        for (Object o : content) {
            Element ele = (Element) o;
            String resource = ele.attributeValue("resource");
            try {
                Reader reader = Resources.getResourceAsReader(resource);
                SAXReader saxReader = new SAXReader();
                Document document = saxReader.read(new InputSource(reader));
                Element root = document.getRootElement();

                // 命名空间
                String namespace = root.attributeValue("namespace");
                // SELECT
                List<Element> selectNodes = root.selectNodes("select");
                for (Element node : selectNodes) {
                    String id = node.attributeValue("id");
                    String parameterType = node.attributeValue("parameterType");
                    String resultType = node.attributeValue("resultType");
                    String sql = node.getText();

                    // ? 匹配
                    Map<Integer, String> parameter = new HashMap<>();
                    Pattern pattern = Pattern.compile("(#\\{(.*?)})");
                    Matcher matcher = pattern.matcher(sql);
                    for (int i = 1; matcher.find(); i++) {
                        String s1 = matcher.group(1);
                        String s2 = matcher.group(2);
                        parameter.put(i, s2);
                        sql = sql.replace(s1, "?");
                    }

                    XMLNode xmlNode = new XMLNode();
                    xmlNode.setNamespace(namespace);
                    xmlNode.setId(id);
                    xmlNode.setParameterType(parameterType);
                    xmlNode.setParameter(parameter);
                    xmlNode.setSql(sql);
                    xmlNode.setResultType(resultType);

                    map.put(namespace + "." + id, xmlNode);
                }
            } catch (IOException | DocumentException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

}
