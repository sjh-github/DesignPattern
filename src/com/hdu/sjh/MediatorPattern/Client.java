package com.hdu.sjh.MediatorPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague(mediator);
        Colleague colleague2 = new ConcreteColleague(mediator);
        mediator.register(colleague1);
        mediator.register(colleague2);
        mediator.operation();
    }
}
