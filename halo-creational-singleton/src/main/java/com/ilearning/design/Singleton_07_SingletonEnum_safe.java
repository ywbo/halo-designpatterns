package com.ilearning.design;

import static com.ilearning.design.enumtype.SingletonEnum.SINGLETONENUM_INSTANCE;

/**
 * 枚举单例（线程安全）
 * <p>
 * · Effective Java 作者推荐使⽤枚举的⽅式解决单例模式，此种⽅式可能是平时最少⽤到的。
 * · 这种⽅式解决了最主要的；线程安全、⾃由串⾏化、单⼀实例。
 * </p>
 *
 * @author yuwenbo
 * @date 2022/6/2 6:36
 **/
public class Singleton_07_SingletonEnum_safe {
    public static void main(String[] args) {
        SINGLETONENUM_INSTANCE.getSingletonEnum();
    }
}
