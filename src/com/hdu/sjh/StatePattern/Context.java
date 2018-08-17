package com.hdu.sjh.StatePattern;

//环境类
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }

    public void changeState(String value) {
        if ("A".equalsIgnoreCase(value)) {
            setState(new ConcreteStateA());
        } else if ("B".equalsIgnoreCase(value)) {
            setState(new ConcreteStateB());
        }
    }
}
