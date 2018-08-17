package com.hdu.sjh.StatePattern;

//具体状态类A
public class ConcreteStateA extends State {
    @Override
    public void handle() {
        System.out.println("ConcreteStateA ia handling");
    }
}
