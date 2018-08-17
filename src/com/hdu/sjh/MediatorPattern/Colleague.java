package com.hdu.sjh.MediatorPattern;


//抽象同事类
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void method1();

    public void method2() {
        mediator.operation();
    }
}
