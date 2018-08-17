package com.hdu.sjh.MediatorPattern;

//具体同事类
public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void method1() {
        System.out.println("ConcreteColleague: method1" );
    }
}
