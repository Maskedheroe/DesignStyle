package com.example.hou.factories.SimpleFactory;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getdNumberA() * getdNumberB();
    }
}
