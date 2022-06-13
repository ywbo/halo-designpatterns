package com.ilearning.design.test;

import com.ilearning.design.EngineController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 非设计模式业务测试类
 *
 * @author yuwenbo
 * @date 2022/6/14 6:52
 **/
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_EngineController() {
        EngineController engineController = new EngineController();
        String process = engineController.process("1001", "man", 29);
        logger.info("测试结果：{}", process);
    }
}
