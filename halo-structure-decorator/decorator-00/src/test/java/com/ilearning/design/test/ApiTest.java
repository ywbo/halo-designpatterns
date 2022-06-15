package com.ilearning.design.test;

import com.ilearning.design.SSOInterceptor;
import org.junit.Test;

/**
 * 非装饰器模式测试类
 *
 * @author yuwenbo
 * @date 2022/6/15 23:00
 **/
public class ApiTest {
    @Test
    public void test_sso() {
        SSOInterceptor ssoInterceptor = new SSOInterceptor();
        String request = "1successhalo";
        boolean success = ssoInterceptor.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }
}
