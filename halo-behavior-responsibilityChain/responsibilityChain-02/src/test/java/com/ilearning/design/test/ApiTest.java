package com.ilearning.design.test;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.AuthLink;
import com.ilearning.design.AuthService;
import com.ilearning.design.impl.Level1AuthLink;
import com.ilearning.design.impl.Level2AuthLink;
import com.ilearning.design.impl.Level3AuthLink;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;

/**
 * 【责任链设计模式】设计模式实现业务逻辑测试类
 *
 * @author yuwenbo
 * @date 2022/6/21 6:37
 **/
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_AuthLink() throws ParseException {
        AuthLink authLink = new Level3AuthLink("1000013", "王工")
                .appendNextLink(new Level2AuthLink("1000012", "张经理")
                        .appendNextLink(new Level1AuthLink("1000011", "段总")));

        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("halo", "1000998004813441", new Date())));

        // 模拟三级负责人审批
        AuthService.auth("1000013", "1000998004813441");
        logger.info("测试结果：{}", "模拟三级负责人审批，王工");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("halo_3", "1000998004813441", new Date())));

        // 模拟二级负责人审批
        AuthService.auth("1000012", "1000998004813441");
        logger.info("测试结果：{}", "模拟二级负责人审批，张经理");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("halo_2", "1000998004813441", new Date())));

        // 模拟一级负责人审批
        AuthService.auth("1000011", "1000998004813441");
        logger.info("测试结果：{}", "模拟一级负责人审批，段总");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("halo_1", "1000998004813441", new Date())));

    }
}
