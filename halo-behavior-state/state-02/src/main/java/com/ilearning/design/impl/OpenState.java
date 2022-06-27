package com.ilearning.design.impl;


import com.ilearning.design.ActivityService;
import com.ilearning.design.Result;
import com.ilearning.design.State;
import com.ilearning.design.enumtype.StateEnum;

import static com.ilearning.design.enumtype.StateEnum.CLOSE;
import static com.ilearning.design.enumtype.StateEnum.DOING;

/**
 * 活动状态；活动开启
 */
public class OpenState extends State {

    @Override
    public Result arraignment(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "活动开启不可提审");
    }

    @Override
    public Result checkPass(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "活动开启不可审核通过");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "活动开启不可审核拒绝");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "活动开启不可撤销审核");
    }

    @Override
    public Result close(String activityId, Enum<StateEnum> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, CLOSE);
        return new Result("0000", "活动关闭完成");
    }

    @Override
    public Result open(String activityId, Enum<StateEnum> currentStatus) {
        return new Result("0001", "活动不可重复开启");
    }

    @Override
    public Result doing(String activityId, Enum<StateEnum> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, DOING);
        return new Result("0000", "活动变更活动中完成");
    }

}