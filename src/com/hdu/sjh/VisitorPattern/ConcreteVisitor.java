package com.hdu.sjh.VisitorPattern;

//具体访问者
public class ConcreteVisitor extends Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visit ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visit ConcreteElementB");
    }
}
