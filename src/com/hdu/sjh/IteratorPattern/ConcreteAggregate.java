package com.hdu.sjh.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

//具体聚合类
public class ConcreteAggregate implements Aggregate {

    public List<Integer> list = null;

    public ConcreteAggregate() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }

    @Override
    public Iterator creteIterator() {
        return new ConcreteIterator();
    }

    //具体迭代器
    private class ConcreteIterator implements Iterator {

        private int cursor = 0;

        @Override
        public Object first() {
            if (list.size() >= 1) {
                return list.get(0);
            } else {
                return null;
            }
        }

        @Override
        public Object next() {
            if (cursor < list.size()) {
                return list.get(cursor++);
            } else {
                return null;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public Object currentItem() {
            return list.get(cursor);
        }
    }
}
