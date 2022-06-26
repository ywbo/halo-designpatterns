package com.ilearning.design.test;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.LotteryResult;
import com.ilearning.design.LotteryService;
import com.ilearning.design.impl.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 【观察者模式】非设计模式下的测试类
 *
 * @author yuwenbo
 * @date 2022/6/26 23:09
 **/
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_lottery() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult lotteryResult = lotteryService.doDraw("2");
        logger.info("测试结果：", JSON.toJSONString(lotteryResult));
    }
}
