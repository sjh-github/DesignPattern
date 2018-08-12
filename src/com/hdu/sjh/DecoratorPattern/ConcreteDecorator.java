package com.hdu.sjh.DecoratorPattern;

//具体装饰类
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehaviour();
    }

    private void addBehaviour() {
        System.out.println("进行装饰A功能");
    }
}
