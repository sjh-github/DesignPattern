package com.hdu.sjh.PrototypePattern;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype c1 = new ConcretePrototype("c1", 10, new Integer[]{1,2,3});
        ConcretePrototype c2 = c1.clone();
        System.out.println(c1 == c2);
        System.out.println(c1.getName() == c2.getName());
        System.out.println(c1.getAge() == c2.getAge());
        System.out.println(c1.getArray() == c2.getArray());
        c1.setName("c");
        c1.setAge(20);
        c1.getArray()[0] = 0;
        System.out.println(c2.getName());
        System.out.println(c2.getAge());
        System.out.println(Arrays.asList(c2.getArray()));
    }
}
