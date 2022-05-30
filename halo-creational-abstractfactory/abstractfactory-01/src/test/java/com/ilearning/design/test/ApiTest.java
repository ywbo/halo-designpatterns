package com.ilearning.design.test;

import com.ilearning.design.CacheService;
import com.ilearning.design.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * 没有使用设计模式接口测试类
 *
 * @author yuwenbo
 * @date 2022/5/30 23:37
 **/
public class ApiTest {
    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("user_name_01", "没有使用设计模式接口测试类", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);

    }
}
