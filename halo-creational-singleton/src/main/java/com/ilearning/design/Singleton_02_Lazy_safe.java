package com.ilearning.design;

/**
 * 懒汉式（线程安全）
 * <p>
 * · 此种模式虽然是安全的，但由于把锁加到⽅法上后，所有的访问都因需要锁占⽤导致资源的浪费。如果不是特殊情况下，不建议此种⽅式实现单例模式。
 * </p>
 *
 * @author yuwenbo
 * @date 2022/6/2 6:12
 **/
public class Singleton_02_Lazy_safe {
    private static Singleton_02_Lazy_safe instance;

    private Singleton_02_Lazy_safe() {
    }

    public static synchronized Singleton_02_Lazy_safe getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_02_Lazy_safe();
        return instance;
    }
}
