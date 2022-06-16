package com.ilearning.design.test;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.Seckill;
import com.ilearning.design.SeckillController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 设计模式下完成重构
 *
 * @author yuwenbo
 * @date 2022/6/16 22:34
 **/
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    private SeckillController seckillController = new SeckillController();

    @Test
    public void test_queryActivityInfo() throws InterruptedException {
        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Seckill seckill = seckillController.queryActivityInfo(req);
            logger.info("测试结果：{} {}", req, JSON.toJSONString(seckill));
            Thread.sleep(1200);
        }
    }
}
