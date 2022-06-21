package com.ilearning.design.test;

import com.ilearning.design.XiaoEr;
import org.junit.Test;

import static com.ilearning.design.enumtype.CuisineEnum.*;

/**
 * 【命令模式】非命令模式下的业务实现测试类
 *
 * @author yuwenbo
 * @date 2022/6/22 6:41
 **/
public class ApiTest {
    @Test
    public void test() {
        // 广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(YUECAI.getCuisine());
        xiaoEr.order(SUCAI.getCuisine());
        xiaoEr.order(LUCAI.getCuisine());
        xiaoEr.order(CHUANCAI.getCuisine());

        // 下单
        xiaoEr.placeOrder();
    }
}
