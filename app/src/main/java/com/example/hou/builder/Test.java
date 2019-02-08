package com.example.hou.builder;

public class Test {
    public static void show(){
        Director director = new Director();
        Bulider b1 = new ConcreteBuilder1();
        Bulider b2 = new ConcreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.build();
        p1.show();

        director.Construct(b2);
        Product p2 = b2.build();  //此部可以替换为链式调用
        p2.show();



    }
}
