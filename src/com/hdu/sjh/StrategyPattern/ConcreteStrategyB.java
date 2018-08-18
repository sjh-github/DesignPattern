package com.hdu.sjh.StrategyPattern;

//具体策略类
public class ConcreteStrategyB extends AbstractStrategy {
    @Override
    public void algorithm() {
        System.out.println("ConcreteStrategyB Algorithm");
    }
}
