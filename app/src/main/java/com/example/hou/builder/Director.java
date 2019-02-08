package com.example.hou.builder;

public class Director {

    public void Construct(Bulider bulider){
        bulider.buildePartA().buildePartB();  //指挥建造过程  此部一般是客户端链式调用  也可以省略指挥者类

    }

}
