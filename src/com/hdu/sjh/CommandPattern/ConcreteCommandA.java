package com.hdu.sjh.CommandPattern;

//具体命令类A
public class ConcreteCommandA extends Command {

    private ReceiverA receiverA;

    public ConcreteCommandA() {
        receiverA = new ReceiverA();
    }

    @Override
    public void execute() {
        receiverA.action();
    }
}
