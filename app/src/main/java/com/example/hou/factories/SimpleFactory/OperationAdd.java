package com.example.hou.factories.SimpleFactory;

public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getdNumberA() + getdNumberB();
    }
}
