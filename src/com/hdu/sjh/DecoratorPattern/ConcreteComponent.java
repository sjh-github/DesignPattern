package com.hdu.sjh.DecoratorPattern;

//具体构件类
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("基础功能");
    }
}
