package com.ilearning.design.test;

import com.ilearning.design.BasicMall;
import com.ilearning.design.impl.JDNetMall;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * [模板方法]设计模式下实现业务逻辑的测试类
 *
 * @author yuwenbo
 * @date 2022/6/29 7:02
 **/
public class ApiTest {
    public Logger logger = LoggerFactory.getLogger(ApiTest.class);

    /**
     * 测试链接
     * 京东；https://item.jd.com/100008348542.html
     * 淘宝；https://detail.tmall.com/item.htm
     * 当当；http://product.dangdang.com/1509704171.html
     */
    @Test
    public void test_NetMall() {
        BasicMall netMall = new JDNetMall("1000001", "*******");
        String base64 = netMall.generateGoodsPoster("https://item.jd.com/100008348542.html");
        logger.info("测试结果：{}", base64);
    }
}
