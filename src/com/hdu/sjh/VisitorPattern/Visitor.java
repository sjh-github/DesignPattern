package com.hdu.sjh.VisitorPattern;

//抽象访问者
public abstract class Visitor {
    public abstract void visit(ConcreteElementA elementA);
    public abstract void visit(ConcreteElementB elementB);
}

