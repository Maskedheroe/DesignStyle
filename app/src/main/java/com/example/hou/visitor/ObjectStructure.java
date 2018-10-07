package com.example.hou.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Person> elements = new ArrayList<>(20);

    public void Attach(Person element){  //增加
        elements.add(element);
    }

    public void Detach(Person element){  //移除
        elements.remove(element);
    }

    public void Display(Acation Visitor){  //遍历展示
        for (Person element : elements) {
            element.accept(Visitor);
        }
    }
}
