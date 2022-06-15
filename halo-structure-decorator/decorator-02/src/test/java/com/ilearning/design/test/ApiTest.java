package com.ilearning.design.test;

import com.ilearning.design.LoginSSODecorator;
import com.ilearning.design.SSOInterceptor;
import org.junit.Test;

/**
 * [装饰器模式]设计模式测试类
 *
 * @author yuwenbo
 * @date 2022/6/15 23:14
 **/
public class ApiTest {
    @Test
    public void test_LoginSsoDecorator() {
        LoginSSODecorator ssoDecorator = new LoginSSODecorator(new SSOInterceptor());
        String request = "1success_halo";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }
}
