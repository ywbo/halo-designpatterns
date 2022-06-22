package com.ilearning.design;

/**
 * 迭代器
 * <p>
 * 这里模仿 JDK 的 Iterator
 *
 * @author yuwenbo
 * @date 2022/6/22 23:01
 **/
public interface Iterator<E> {

    boolean hasNext();

    E next();
}
