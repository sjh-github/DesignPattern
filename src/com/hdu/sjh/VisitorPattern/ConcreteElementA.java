package com.hdu.sjh.VisitorPattern;

//具体元素
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
