package com.ilearning.design.test;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.AuthController;
import com.ilearning.design.AuthService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;

/**
 * 非责任链设计模式实现业务测试类
 *
 * @author yuwenbo
 * @date 2022/6/21 6:03
 **/
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_AuthController() throws ParseException {
        AuthController authController = new AuthController();

        // 模拟三级负责人审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("halo_3", "1000998004813441", new Date())));
        logger.info("测试结果：{}", "模拟三级负责人审批，halo_3");
        AuthService.auth("1000013", "1000998004813441");

        // 模拟二级负责人审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("halo_2", "1000998004813441", new Date())));
        logger.info("测试结果：{}", "模拟二级负责人审批，halo_2");
        AuthService.auth("1000012", "1000998004813441");

        // 模拟一级负责人审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("halo_1", "1000998004813441", new Date())));
        logger.info("测试结果：{}", "模拟一级负责人审批，halo_1");
        AuthService.auth("1000011", "1000998004813441");

        logger.info("测试结果：{}", "审批完成");
    }
}
