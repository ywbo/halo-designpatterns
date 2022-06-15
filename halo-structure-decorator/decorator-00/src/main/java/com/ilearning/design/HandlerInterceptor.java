package com.ilearning.design;

/**
 * 处理拦截器
 *
 * @author yuwenbo
 * @date 2022/6/15 22:55
 **/
public interface HandlerInterceptor {
    boolean preHandle(String request, String response, Object handler);
}
