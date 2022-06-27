package com.ilearning.design.test;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.ActivityExecStatusController;
import com.ilearning.design.ActivityService;
import com.ilearning.design.Result;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.ilearning.design.enumtype.StateEnum.*;

/**
 * 【状态模式】非设计模式测试类
 *
 * @author yuwenbo
 * @date 2022/6/28 6:30
 **/
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {

        // 初始化数据
        String activityId = "100001";
        ActivityService.init(activityId, EDITING);

        ActivityExecStatusController activityExecStatusController = new ActivityExecStatusController();
        Result resultRefuse = activityExecStatusController.execStatus(activityId, EDITING, REFUSE);

        logger.info("测试结果(编辑中To审核拒绝)：{}", JSON.toJSONString(resultRefuse));

        Result resultCheck = activityExecStatusController.execStatus(activityId, EDITING, CHECK);
        logger.info("测试结果(编辑中To提交审核)：{}", JSON.toJSONString(resultCheck));
    }
}
