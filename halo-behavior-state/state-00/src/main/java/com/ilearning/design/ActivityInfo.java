package com.ilearning.design;

import com.ilearning.design.enumtype.StateEnum;
import lombok.Data;

import java.util.Date;

/**
 * 营销活动信息
 *
 * @author yuwenbo
 * @date 2022/6/27 6:56
 **/
@Data
public class ActivityInfo {
    /**
     * 活动ID
     */
    private String activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动状态
     */
    private Enum<StateEnum> status;

    /**
     * 开始时间
     */
    private Date beginTime;

    /**
     * 结束时间
     */
    private Date endTime;
}
