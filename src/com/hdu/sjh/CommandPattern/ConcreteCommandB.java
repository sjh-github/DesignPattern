package com.hdu.sjh.CommandPattern;

//具体命令类B
public class ConcreteCommandB extends Command {

    private ReceiverB receiverB;

    public ConcreteCommandB() {
        receiverB = new ReceiverB();
    }

    @Override
    public void execute() {
        receiverB.action();
    }
}
