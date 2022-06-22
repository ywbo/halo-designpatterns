package com.ilearning.design;

/**
 * 集合类
 *
 * @author yuwenbo
 * @date 2022/6/22 23:04
 **/
public interface Collection<E, L> extends Iterable<E> {
    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    @Override
    Iterator<E> iterator();
}
