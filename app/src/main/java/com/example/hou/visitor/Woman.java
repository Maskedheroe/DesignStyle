package com.example.hou.visitor;

public class Woman extends Person {
    @Override
    public void accept(Acation visitor) {
        visitor.getwomanConclusion(this);  //双分派技术
    }

}
