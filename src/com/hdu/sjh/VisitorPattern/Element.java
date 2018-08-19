package com.hdu.sjh.VisitorPattern;

//抽象元素
public interface Element {
    void accept(Visitor visitor);
}
