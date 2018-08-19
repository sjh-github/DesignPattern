package com.hdu.sjh.VisitorPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        Element element = new ConcreteElementA();
        element.accept(visitor);
    }
}
