package com.example.hou.iterator;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String []args){
        ConcreteAggregate a = new ConcreteAggregate();
        List list= new ArrayList();
        list.add("大鸟");
        list.add("小菜");
        list.add("A");
        list.add("c");

        a.setItems(list);

        Iterator i = new ConcreteIterator(a);
        Object item = i.First();
        while (!i.IsDone()){
            System.out.println(i.CurrentItem()+"请买车票");
            i.Next();
        }
    }

}
