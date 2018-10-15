package com.example.hou.factories.SimpleFactory;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getdNumberA() - getdNumberB();
    }
}
