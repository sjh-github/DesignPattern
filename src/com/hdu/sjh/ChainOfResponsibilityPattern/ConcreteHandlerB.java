package com.hdu.sjh.ChainOfResponsibilityPattern;

//具体处理者B
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("B".equalsIgnoreCase(request)) {
            System.out.println("B Handler Request");
        } else {
            this.successor.handleRequest(request);
        }
    }
}
