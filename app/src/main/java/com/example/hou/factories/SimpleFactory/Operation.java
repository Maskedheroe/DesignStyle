package com.example.hou.factories.SimpleFactory;

public abstract class Operation {

    // 简单工厂 又叫静态工厂 是设计模式的入门

    private double dNumberA = 0;
    private double dNumberB = 0;

    public double getdNumberA() {
        return dNumberA;
    }

    public void setdNumberA(double dNumberA) {
        this.dNumberA = dNumberA;
    }

    public double getdNumberB() {
        return dNumberB;
    }

    public void setdNumberB(double dNumberB) {
        this.dNumberB = dNumberB;
    }

    /*
    * 获得结果
    *
    * */

    public abstract double getResult();


}
