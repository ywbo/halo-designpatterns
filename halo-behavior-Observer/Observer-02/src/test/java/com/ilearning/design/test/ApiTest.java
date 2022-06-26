package com.ilearning.design.test;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.LotteryResult;
import com.ilearning.design.LotteryService;
import com.ilearning.design.impl.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 【观察者】模式，测试类
 *
 * @author yuwenbo
 * @date 2022/6/27 5:56
 **/
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_lottery() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("123456");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }
}
