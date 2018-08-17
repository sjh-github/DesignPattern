package com.hdu.sjh.MementoPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("state1");
        System.out.println("目前：" + originator.getState());

        System.out.println("保存状态");
        caretaker.setMemento(new Memento(originator));

        originator.setState("state2");
        System.out.println("目前：" + originator.getState());
        System.out.println("返回");
        originator.restoreState(caretaker.getMemento());
        System.out.println("目前：" + originator.getState());
    }
}
