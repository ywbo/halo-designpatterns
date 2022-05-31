package com.ilearning.design.test;

import com.ilearning.design.Builder;
import org.junit.Test;

/**
 * 使用建造者设计模式，实现业务逻辑后 测试类
 *
 * @author yuwenbo
 * @date 2022/6/1 6:05
 **/
public class ApiTest {
    @Test
    public void test_DecorationPackageMenu() {
        Builder builder = new Builder();

        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(86.03D).getDetail());
    }
}
