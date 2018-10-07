package com.example.hou.visitor;

public class Man extends Person {
    @Override
    public void accept(Acation visitor) {
        visitor.getManConclusion(this);
    }
}
