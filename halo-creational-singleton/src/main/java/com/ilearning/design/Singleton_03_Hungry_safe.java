package com.ilearning.design;

/**
 * 饿汉式（线程安全）
 * <p>
 * · 此种⽅式与我们开头的第⼀个实例化 Map 基本⼀致，在程序启动的时候直接运⾏加载，后续有外部需要使⽤的时候获取即可。
 * · 此种⽅式并不是懒加载，也就是说⽆论你程序中是否⽤到这样的类都会在程序启动之初进⾏创建。
 * · 那么这种⽅式导致的问题就像你下载个游戏软件，可能你游戏地图还没有打开呢，但是程序已经将这些地图全部实例化。到你⼿机上最明显体验就⼀开游戏内存满了，⼿机卡了，需要换了。
 * </p>
 *
 * @author yuwenbo
 * @date 2022/6/2 6:15
 **/
public class Singleton_03_Hungry_safe {
    // 不管三七二十一，上来我就先 new 一个。
    private static Singleton_03_Hungry_safe instance = new Singleton_03_Hungry_safe();

    private Singleton_03_Hungry_safe() {
    }

    public static Singleton_03_Hungry_safe getInstance() {
        return instance;
    }
}
