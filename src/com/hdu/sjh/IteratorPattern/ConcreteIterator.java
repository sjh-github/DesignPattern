package com.hdu.sjh.IteratorPattern;

//具体迭代器
public class ConcreteIterator implements Iterator {

    private ConcreteAggregate concreteAggregate;
    private int cursor = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        if (concreteAggregate.list.size() >= 1) {
            return concreteAggregate.list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Object next() {
        if (cursor < concreteAggregate.list.size()) {
            return concreteAggregate.list.get(cursor++);
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return cursor < concreteAggregate.list.size();
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.list.get(cursor);
    }
}
