package com.ilearning.design.enumtype;

/**
 * 【状态模式】枚举类
 *
 * @author yuwenbo
 * @date 2022/6/27 6:47
 **/
public enum StateEnum {
    /**
     * 1创建编辑
     */
    EDITING(1),

    /**
     * 2待审核
     */
    CHECK(2),

    /**
     * 3审核通过(任务扫描成活动中)
     */
    PASS(3),

    /**
     * 4审核拒绝(可以撤审到编辑状态)
     */
    REFUSE(4),

    /**
     * 5活动中
     */
    DOING(5),

    /**
     * 6活动关闭
     */
    CLOSE(6),

    /**
     * 7活动开启(任务扫描成活动中)
     */
    OPEN(7);

    private int state;

    public int getState() {
        return state;
    }

    StateEnum(int state) {
        this.state = state;
    }
}
