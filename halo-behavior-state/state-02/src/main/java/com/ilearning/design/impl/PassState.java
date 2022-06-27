package com.ilearning.design.impl;


import com.ilearning.design.ActivityService;
import com.ilearning.design.Result;
import com.ilearning.design.State;
import com.ilearning.design.enumtype.StateEnum;

import static com.ilearning.design.enumtype.StateEnum.*;

/**
 * 活动状态；审核通过
 */
public class PassState extends State {

    @Override
    public Result arraignment(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "已审核状态不可重复提审");
    }

    @Override
    public Result checkPass(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "已审核状态不可重复审核");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<StateEnum> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, REFUSE);
        return new Result("0000", "活动审核拒绝完成");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "审核通过不可撤销(可先拒绝审核)");
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
        ActivityService.execStatus(activityId, currentStatus, DOING);
        return new Result("0000", "活动变更活动中完成");
    }

}
