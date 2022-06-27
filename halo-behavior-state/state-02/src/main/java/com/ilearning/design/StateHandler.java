package com.ilearning.design;

import com.ilearning.design.enumtype.StateEnum;
import com.ilearning.design.impl.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.ilearning.design.enumtype.StateEnum.*;

/**
 * 活动状态处理器
 *
 * @author yuwenbo
 * @date 2022/6/28 6:39
 **/
public class StateHandler {
    private Map<Enum<StateEnum>, State> stateMap = new ConcurrentHashMap<Enum<StateEnum>, State>();

    public StateHandler() {
        stateMap.put(CHECK, new CheckState());     // 待审核
        stateMap.put(CLOSE, new CloseState());     // 已关闭
        stateMap.put(DOING, new DoingState());     // 活动中
        stateMap.put(EDITING, new EditingState()); // 编辑中
        stateMap.put(OPEN, new OpenState());       // 已开启
        stateMap.put(PASS, new PassState());       // 审核通过
        stateMap.put(REFUSE, new RefuseState());   // 审核拒绝
    }

    public Result arraignment(String activityId, Enum<StateEnum> currentStatus) {
        return stateMap.get(currentStatus).arraignment(activityId, currentStatus);
    }

    public Result checkPass(String activityId, Enum<StateEnum> currentStatus) {
        return stateMap.get(currentStatus).checkPass(activityId, currentStatus);
    }

    public Result checkRefuse(String activityId, Enum<StateEnum> currentStatus) {
        return stateMap.get(currentStatus).checkRefuse(activityId, currentStatus);
    }

    public Result checkRevoke(String activityId, Enum<StateEnum> currentStatus) {
        return stateMap.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    public Result close(String activityId, Enum<StateEnum> currentStatus) {
        return stateMap.get(currentStatus).close(activityId, currentStatus);
    }

    public Result open(String activityId, Enum<StateEnum> currentStatus) {
        return stateMap.get(currentStatus).open(activityId, currentStatus);
    }

    public Result doing(String activityId, Enum<StateEnum> currentStatus) {
        return stateMap.get(currentStatus).doing(activityId, currentStatus);
    }
}
