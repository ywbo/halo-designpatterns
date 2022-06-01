package com.ilearning.design;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 使用JDK的CAS机制（线程安全）
 * <p>
 * · java并发库提供了很多原⼦类来⽀持并发访问的数据安全性； AtomicInteger 、 AtomicBoolean 、 AtomicLong 、 AtomicReference 。
 * · AtomicReference 可以封装引⽤⼀个V实例，⽀持并发访问如上的单例⽅式就是使⽤了这样的⼀个特点。
 * · 使⽤CAS的好处就是不需要使⽤传统的加锁⽅式保证线程安全，⽽是依赖于CAS的忙等算法，依赖于底层硬件的实现，来保证线程安全。相对于其他锁的实现没有线程的切换和阻塞也就没有了额外的开销，并且可以⽀持较⼤的并发性。
 * · 当然CAS也有⼀个缺点就是忙等，如果⼀直没有获取到将会处于死循环中。
 * </p>
 *
 * @author yuwenbo
 * @date 2022/6/2 6:30
 **/
public class Singleton_06_CAS_safe {
    private static AtomicReference<Singleton_06_CAS_safe> INSTANCE = new AtomicReference<>();

    private Singleton_06_CAS_safe() {
    }

    public static Singleton_06_CAS_safe getInstance() {
        for (; ; ) {
            Singleton_06_CAS_safe instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_06_CAS_safe());
            return INSTANCE.get();
        }
    }

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        System.out.println(Singleton_06_CAS_safe.getInstance());
        System.out.println(Singleton_06_CAS_safe.getInstance());
    }
}
