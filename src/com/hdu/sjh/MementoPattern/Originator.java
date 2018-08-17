package com.hdu.sjh.MementoPattern;

//原发器
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(this);
    }

    public void restoreState(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
