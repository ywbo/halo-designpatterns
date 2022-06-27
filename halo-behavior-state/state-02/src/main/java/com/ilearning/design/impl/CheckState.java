package com.ilearning.design.impl;

import com.ilearning.design.ActivityService;
import com.ilearning.design.Result;
import com.ilearning.design.State;
import com.ilearning.design.enumtype.StateEnum;

import static com.ilearning.design.enumtype.StateEnum.*;

/**
 * 活动状态；待审核
 */
public class CheckState extends State {

    @Override
    public Result arraignment(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "待审核状态不可重复提审");
    }

    @Override
    public Result checkPass(String activityId, Enum<StateEnum> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, PASS);
        return new Result("0000", "活动审核通过完成");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<StateEnum> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, REFUSE);
        return new Result("0000", "活动审核拒绝完成");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<StateEnum> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, EDITING);
        return new Result("0000", "活动审核撤销回到编辑中");
    }

    @Override
    public Result close(String activityId, Enum<StateEnum> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, CLOSE);
        return new Result("0000", "活动审核关闭完成");
    }

    @Override
    public Result open(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "非关闭活动不可开启");
    }

    @Override
    public Result doing(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "待审核活动不可执行活动中变更");
    }

}
