package com.ilearning.design;

/**
 * 懒汉式（线程不安全）
 * <p>
 * · 单例模式有⼀个特点就是不允许外部直接创建，也就是 new Singleton_01_Lazy_unsafe() ，因此这⾥在默认的构造函数上添加了私有属性 private 。
 * · ⽬前此种⽅式的单例确实满⾜了懒加载，但是如果有多个访问者同时去获取对象实例你可以想象成⼀堆⼈在抢厕所，就会造成多个同样的实例并存，从⽽没有达到单例的要求。
 * </p>
 *
 * @author yuwenbo
 * @date 2022/6/2 6:10
 **/
public class Singleton_01_Lazy_unsafe {
    private static Singleton_01_Lazy_unsafe instance;

    private Singleton_01_Lazy_unsafe() {
    }

    public static Singleton_01_Lazy_unsafe getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_01_Lazy_unsafe();
        return instance;
    }
}
