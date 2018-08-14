package com.hdu.sjh.ChainOfResponsibilityPattern;

//具体处理者A
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("A".equalsIgnoreCase(request)) {
            System.out.println("A Handler Request");
        } else {
            this.successor.handleRequest(request);
        }
    }
}
