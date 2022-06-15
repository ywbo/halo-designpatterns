package com.ilearning.design;

/**
 * SSO 装饰器抽象类
 *
 * @author yuwenbo
 * @date 2022/6/15 23:10
 **/
public abstract class SSODecorator implements HandlerInterceptor {
    private HandlerInterceptor handlerInterceptor;

    private SSODecorator() {
    }

    public SSODecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
