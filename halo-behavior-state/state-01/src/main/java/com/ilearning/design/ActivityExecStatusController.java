package com.ilearning.design;

import com.ilearning.design.enumtype.StateEnum;

import static com.ilearning.design.enumtype.StateEnum.*;

/**
 * 活动处理流程状态
 *
 * @author yuwenbo
 * @date 2022/6/28 5:57
 **/
public class ActivityExecStatusController {
    /**
     * 活动状态变更
     * 1. 编辑中 -> 提审、关闭
     * 2. 审核通过 -> 拒绝、关闭、活动中
     * 3. 审核拒绝 -> 撤审、关闭
     * 4. 活动中 -> 关闭
     * 5. 活动关闭 -> 开启
     * 6. 活动开启 -> 关闭
     *
     * @param activityId   活动ID
     * @param beforeStatus 变更前状态
     * @param afterStatus  变更后状态
     * @return 返回结果
     */
    public Result execStatus(String activityId, Enum<StateEnum> beforeStatus, Enum<StateEnum> afterStatus) {
        // 1. 编辑中 -> 提审、关闭
        if (EDITING.equals(beforeStatus)) {
            if (CHECK.equals(afterStatus) || CLOSE.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更状态拒绝");
            }
        }

        // 2. 审核通过 -> 拒绝、关闭、活动中
        if (PASS.equals(beforeStatus)) {
            if (REFUSE.equals(afterStatus) || DOING.equals(afterStatus) || CLOSE.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更状态拒绝");
            }
        }

        // 3. 审核拒绝 -> 撤审、关闭
        if (REFUSE.equals(beforeStatus)) {
            if (EDITING.equals(afterStatus) || CLOSE.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更状态拒绝");
            }
        }

        // 4. 活动中 -> 关闭
        if (DOING.equals(beforeStatus)) {
            if (CLOSE.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更状态拒绝");
            }
        }

        // 5. 活动关闭 -> 开启
        if (CLOSE.equals(beforeStatus)) {
            if (OPEN.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更状态拒绝");
            }
        }

        // 6. 活动开启 -> 关闭
        if (OPEN.equals(beforeStatus)) {
            if (CLOSE.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更状态拒绝");
            }
        }

        return new Result("0001", "非可处理的活动状态变更");
    }
}
