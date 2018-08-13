package com.hdu.sjh.FlyweightPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweightA1 = flyweightFactory.getFlyweight("A");
        Flyweight flyweightA2 = flyweightFactory.getFlyweight("A");
        Flyweight flyweightB1 = flyweightFactory.getFlyweight("B");
        System.out.println(flyweightA1 == flyweightA2);
        System.out.println(flyweightB1 == flyweightA1);
    }
}
