package com.hdu.sjh.FlyweightPattern;

import java.util.HashMap;

//享元工厂类
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("A", new ConcreteFlyweightA());
        flyweights.put("B", new ConcreteFlyweightB());
    }

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            return null;
        }
    }
}
