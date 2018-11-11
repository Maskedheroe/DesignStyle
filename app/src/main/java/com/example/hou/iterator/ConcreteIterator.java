package com.example.hou.iterator;

public class ConcreteIterator extends Iterator {

    private final ConcreteAggregate aggregate;    //具体的索引对象

    private int current = 0;   //当前索引下标

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {

        this.aggregate = concreteAggregate;

    }


    @Override
    public Object First() {
        return aggregate.getItems().get(0);
    }

    @Override
    public Object Next() {    //得到聚集的下一个对象
        Object ret = null;
        current++;
        if (current<aggregate.count()){  //未越界 就可以索引
            ret = aggregate.getItems().get(current);
        }
        return ret;

    }

    @Override
    public boolean IsDone() { //遍历是否到结尾
        return current >= aggregate.count();
    }

    @Override
    public Object CurrentItem() {   //获取当前聚集对象
        return aggregate.getItems().get(current);
    }
}
