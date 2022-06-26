package com.ilearning.design;

import com.ilearning.design.enumtype.StateEnum;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 营销活动服务
 *
 * @author yuwenbo
 * @date 2022/6/27 6:58
 **/
public class ActivityService {

    private static Map<String, Enum<StateEnum>> stateMap = new ConcurrentHashMap<>();

    public void init(String activityId, Enum<StateEnum> status) {
        // 模拟查询活动信息
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setActivityId(activityId);
        activityInfo.setActivityName("早起学习打卡领奖活动");
        activityInfo.setStatus(status);
        activityInfo.setBeginTime(new Date());
        activityInfo.setEndTime(new Date());
        stateMap.put(activityId, status);
    }

    /**
     * 查询活动信息
     *
     * @param activityId 活动ID
     * @return 查询结果
     */
    public static ActivityInfo queryActivityInfo(String activityId) {
        // 模拟查询活动信息
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setActivityId(activityId);
        activityInfo.setActivityName("早起学习打卡领奖活动");
        activityInfo.setStatus(stateMap.get(activityId));
        activityInfo.setBeginTime(new Date());
        activityInfo.setEndTime(new Date());
        return activityInfo;
    }

    /**
     * 查询活动状态
     *
     * @param activityId 活动ID
     * @return 查询结果
     */
    public static Enum<StateEnum> queryActivityStatus(String activityId) {
        return stateMap.get(activityId);
    }

    /**
     * 执行状态变更
     *
     * @param activityId   活动ID
     * @param beforeStatus 变更前状态
     * @param afterStatus  变更后状态 b
     */
    public static synchronized void execStatus(String activityId, Enum<StateEnum> beforeStatus, Enum<StateEnum> afterStatus) {
        if (!beforeStatus.equals(stateMap.get(activityId))) return;
        stateMap.put(activityId, afterStatus);
    }
}
