package com.hdu.sjh.BuilderPattern;

public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        System.out.println("建造部件A");
        super.product.setPartA("部件A");
    }

    @Override
    public void buildPartB() {
        System.out.println("建造部件B");
        super.product.setPartB("部件B");
    }

    @Override
    public void buildPartC() {
        System.out.println("建造部件C");
        super.product.setPartC("部件C");
    }
}
