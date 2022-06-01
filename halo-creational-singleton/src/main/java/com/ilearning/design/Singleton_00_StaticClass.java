package com.ilearning.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态类
 * <p>
 * · 以上这种⽅式在我们平常的业务开发中⾮常场常⻅，这样静态类的⽅式可以在第⼀次运⾏的时候直接初始化Map类，同时这⾥我们也不需要到延迟加载在使⽤。
 * · 在不需要维持任何状态下，仅仅⽤于全局访问，这个使⽤使⽤静态类的⽅式更加⽅便。
 * · 如果需要被继承以及需要维持⼀些特定状态的情况下，就适合使⽤单例模式。
 * </p>
 *
 * @author yuwenbo
 * @date 2022/6/2 6:06
 **/
public class Singleton_00_StaticClass {
    public static Map<String, String> cacheMap = new ConcurrentHashMap<>();
}
