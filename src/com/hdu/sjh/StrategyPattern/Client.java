package com.hdu.sjh.StrategyPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        AbstractStrategy abstractStrategy = new ConcreteStrategyA();
        Context context = new Context(abstractStrategy);
        context.algorithm();
        context.setAbstractStrategy(new ConcreteStrategyB());
        context.algorithm();
    }
}
