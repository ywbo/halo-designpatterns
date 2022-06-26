package com.ilearning.design;

/**
 * 私家车车牌号调控服务
 *
 * @author yuwenbo
 * @date 2022/6/26 22:45
 **/
public class CarTargetService {

    /**
     * 模拟摇号，但不是摇号算法
     *
     * @param uId 用户编号
     * @return 结果
     */
    public String lottery(String uId) {
        return Math.abs(uId.hashCode()) % 2 == 0 ? "恭喜你，编码：".concat(uId).concat("在本次摇号中签！") : "很遗憾，编码：".concat(uId).concat("在本次摇号未中签或摇号资格已过期！");
    }
}
