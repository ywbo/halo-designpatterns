package com.ilearning.design.test;

import com.ilearning.design.DataView;
import com.ilearning.design.visitor.impl.Parent;
import com.ilearning.design.visitor.impl.Principal;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * [访问者模式]设计模式测试类
 *
 * @author yuwenbo
 * @date 2022/6/29 22:57
 **/
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        DataView dataView = new DataView();
        
        // 家长
        logger.info("\r\n家长视角访问：");
        dataView.show(new Parent());

        // 校长
        logger.info("\r\n校长视角访问：");
        dataView.show(new Principal());
    }
}
