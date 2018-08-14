package com.hdu.sjh.FlyweightPattern;

//抽象享元类
public abstract class Flyweight {
    //内部状态作为成员变量
    private String intrinsicState;

    public Flyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    //外部状态在使用是由外部设置，不保存在享元对象中
    public void operation(String extrinsicState) {
        System.out.println(intrinsicState + " - 外部状态设置：" + extrinsicState);
    }
}
