package com.hdu.sjh.DecoratorPattern;

//抽象装饰类
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
