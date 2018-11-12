package com.example.hou.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
    //具体聚集类 继承Aggregate

    private List<Object> items = new ArrayList<>();

    public List<Object> getItems() {  //索引器的getter setter
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }



}
