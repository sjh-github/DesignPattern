package com.hdu.sjh.StrategyPattern;

//具体策略类
public class ConcreteStrategyA extends AbstractStrategy {
    @Override
    public void algorithm() {
        System.out.println("ConcreteStrategyA Algorithm");
    }
}
