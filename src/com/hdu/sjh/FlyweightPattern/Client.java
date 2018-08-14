package com.hdu.sjh.FlyweightPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweightA1 = flyweightFactory.getFlyweight("A");
        Flyweight flyweightA2 = flyweightFactory.getFlyweight("A");
        Flyweight flyweightB1 = flyweightFactory.getFlyweight("B");
        flyweightA1.operation("外部状态A1");
        flyweightA2.operation("外部状态A2");
        flyweightB1.operation("外部状态B1");
        System.out.println(flyweightA1 == flyweightA2);
        System.out.println(flyweightB1 == flyweightA1);

    }
}
