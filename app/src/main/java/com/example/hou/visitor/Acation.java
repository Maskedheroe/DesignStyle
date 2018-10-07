package com.example.hou.visitor;

interface Acation {
    //得到男人结论或反应
    public abstract void getManConclusion(Man concreteElementA);
    //得到女人结论或反应
    public abstract void getwomanConclusion(Woman concreteElementA);
}
