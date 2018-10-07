package com.example.hou.visitor;

public class Success implements Acation {
    private String name;

    @Override
    public void getManConclusion(Man concreteElementA) {
        //操作Man
    }


    @Override
    public void getwomanConclusion(Woman concreteElementA) {
        //操作Woman
    }
}
