package com.hdu.sjh.StatePattern;

//具体状态类B
public class ConcreteStateB extends State {
    @Override
    public void handle() {
        System.out.println("ConcreteStateB ia handling");
    }
}
