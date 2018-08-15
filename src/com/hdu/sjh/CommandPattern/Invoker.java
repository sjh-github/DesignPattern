package com.hdu.sjh.CommandPattern;

//调用者
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }

    public static void main(String[] args) {
        Command commandA = new ConcreteCommandA();
        Command commandB = new ConcreteCommandB();
        Invoker invoker = new Invoker(commandA);
        invoker.call();
        invoker.setCommand(commandB);
        invoker.call();
    }
}
