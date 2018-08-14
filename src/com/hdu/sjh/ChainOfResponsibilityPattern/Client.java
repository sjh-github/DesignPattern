package com.hdu.sjh.ChainOfResponsibilityPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Handler handlerA, handlerB;
        handlerA = new ConcreteHandlerA();
        handlerB = new ConcreteHandlerB();

        //创建职责链
        handlerA.setSuccessor(handlerB);

        handlerA.handleRequest("A");
        handlerA.handleRequest("B");
    }
}
