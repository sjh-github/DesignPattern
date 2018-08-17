package com.hdu.sjh.IteratorPattern;

//抽象迭代器
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
    Object currentItem();
}
