package com.ilearning.design.test;

import com.ilearning.design.DecorationPackageController;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * 非设计模式实现业务逻辑，测试类
 *
 * @author yuwenbo
 * @date 2022/6/1 5:45
 **/
public class ApiTest {
    @Test
    public void test_DecorationPackageController() {
        DecorationPackageController decoration = new DecorationPackageController();

        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"), 1));
        
        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"), 2));

        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"), 3));

    }
}
