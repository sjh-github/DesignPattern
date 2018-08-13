package com.hdu.sjh.FlyweightPattern;

import java.util.HashMap;

//享元工厂类
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return  flyweights.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
            return flyweight;
        }
    }
}
