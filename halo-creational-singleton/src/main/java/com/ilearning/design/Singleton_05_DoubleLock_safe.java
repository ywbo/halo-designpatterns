package com.ilearning.design;

/**
 * 双重锁（线程安全）
 * <p>
 * · 双重锁的⽅式是⽅法级锁的优化，减少了部分获取实例的耗时。
 * · 同时这种⽅式也满⾜了懒加载。
 * </p>
 *
 * @author yuwenbo
 * @date 2022/6/2 6:24
 **/
public class Singleton_05_DoubleLock_safe {
    private static Singleton_05_DoubleLock_safe instance;

    private Singleton_05_DoubleLock_safe() {
    }

    public static Singleton_05_DoubleLock_safe getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton_05_DoubleLock_safe.class) {
            if (null == instance) {
                instance = new Singleton_05_DoubleLock_safe();
            }
        }
        return instance;
    }

}
