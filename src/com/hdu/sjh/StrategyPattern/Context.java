package com.hdu.sjh.StrategyPattern;

//环境类
public class Context {
    private AbstractStrategy abstractStrategy;

    public Context(AbstractStrategy abstractStrategy) {
        this.abstractStrategy = abstractStrategy;
    }


    public void setAbstractStrategy(AbstractStrategy abstractStrategy) {
        this.abstractStrategy = abstractStrategy;
    }

    public void algorithm() {
        abstractStrategy.algorithm();
    }
}
