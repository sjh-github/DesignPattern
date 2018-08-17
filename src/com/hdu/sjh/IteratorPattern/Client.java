package com.hdu.sjh.IteratorPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.creteIterator();
        System.out.println("first: " + iterator.first());
        System.out.println("hasNext: " + iterator.hasNext());
        System.out.println("currentItem: " + iterator.currentItem());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
