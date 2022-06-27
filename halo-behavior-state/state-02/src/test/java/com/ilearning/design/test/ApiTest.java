package com.ilearning.design.test;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.ActivityService;
import com.ilearning.design.Result;
import com.ilearning.design.StateHandler;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.ilearning.design.enumtype.StateEnum.EDITING;
import static com.ilearning.design.enumtype.StateEnum.REFUSE;

/**
 * 【状态模式】测试类
 *
 * @author yuwenbo
 * @date 2022/6/28 6:52
 **/
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_Editing2Arraignment() {
        String activityId = "100001";
        ActivityService.init(activityId, EDITING);

        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.arraignment(activityId, EDITING);

        logger.info("测试结果(编辑中To提审活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }

    @Test
    public void test_Editing2Open() {
        String activityId = "100001";
        ActivityService.init(activityId, EDITING);

        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.open(activityId, EDITING);

        logger.info("测试结果(编辑中To开启活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }

    @Test
    public void test_Refuse2Doing() {
        String activityId = "100001";
        ActivityService.init(activityId, REFUSE);

        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.doing(activityId, REFUSE);

        logger.info("测试结果(拒绝To活动中)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }

    @Test
    public void test_Refuse2Revoke() {
        String activityId = "100001";
        ActivityService.init(activityId, REFUSE);

        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.checkRevoke(activityId, REFUSE);

        logger.info("测试结果(拒绝To撤审)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }
}
