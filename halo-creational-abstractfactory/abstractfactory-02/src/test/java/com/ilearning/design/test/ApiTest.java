package com.ilearning.design.test;

import com.ilearning.design.CacheService;
import com.ilearning.design.impl.CacheServiceImpl;
import com.ilearning.design.proxy.JDKProxy;
import com.ilearning.design.proxy.impl.EGMCacheAdapter;
import com.ilearning.design.proxy.impl.IIRCacheAdapter;
import org.junit.Test;

/**
 * 抽象工厂设计模式接口测试类
 *
 * @author yuwenbo
 * @date 2022/5/31 6:38
 **/
public class ApiTest {
    @Test
    public void test_CacheService() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "使用抽象工厂设计模式测试结果");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "使用抽象工厂设计模式测试结果");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }
}
