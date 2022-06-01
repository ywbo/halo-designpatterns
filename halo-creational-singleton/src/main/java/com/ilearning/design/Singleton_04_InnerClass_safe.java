package com.ilearning.design;

/**
 * 内部类（线程安全）
 * <p>
 * · 使⽤类的静态内部类实现的单例模式，既保证了线程安全有保证了懒加载，同时不会因为加锁的⽅式耗费性能。
 * · 这主要是因为JVM虚拟机可以保证多线程并发访问的正确性，也就是⼀个类的构造⽅法在多线程环境下可以被正确的加载。
 * · 此种⽅式也是⾮常推荐使⽤的⼀种单例模式
 * </p>
 *
 * @author yuwenbo
 * @date 2022/6/2 6:19
 **/
public class Singleton_04_InnerClass_safe {
    private static class SingletonHolder {
        private static Singleton_04_InnerClass_safe instance = new Singleton_04_InnerClass_safe();
    }

    private Singleton_04_InnerClass_safe() {
    }

    public static Singleton_04_InnerClass_safe getInstance() {
        return SingletonHolder.instance;
    }
}
