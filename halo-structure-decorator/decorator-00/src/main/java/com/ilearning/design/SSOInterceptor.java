package com.ilearning.design;

/**
 * SSO 单点登录拦截器
 *
 * @author yuwenbo
 * @date 2022/6/15 22:58
 **/
public class SSOInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取 cookie
        String ticket = request.substring(1, 8);

        // 模拟校验
        return ticket.equals("success");
    }
}
