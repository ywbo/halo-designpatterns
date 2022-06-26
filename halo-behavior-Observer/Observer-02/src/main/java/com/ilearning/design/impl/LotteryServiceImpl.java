package com.ilearning.design.impl;

import com.ilearning.design.CarTargetService;
import com.ilearning.design.LotteryResult;
import com.ilearning.design.LotteryService;

import java.util.Date;

/**
 * 摇号接口实现
 *
 * @author yuwenbo
 * @date 2022/6/27 5:52
 **/
public class LotteryServiceImpl extends LotteryService {

    private CarTargetService carTargetService = new CarTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = carTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
