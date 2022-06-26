package com.ilearning.design;

/**
 * 车牌号调整服务接口
 *
 * @author yuwenbo
 * @date 2022/6/26 22:58
 **/
public interface LotteryService {
    
    LotteryResult doDraw(String uId);
}
