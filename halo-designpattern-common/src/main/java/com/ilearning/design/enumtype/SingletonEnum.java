package com.ilearning.design.enumtype;

/**
 * 枚举单例
 *
 * @author yuwenbo
 * @date 2022/6/2 6:03
 **/
public enum SingletonEnum {
    SINGLETONENUM_INSTANCE;

    public void getSingletonEnum() {
        System.out.println("halo~ SingletonEnum");
    }
}
