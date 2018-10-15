package com.example.hou.factories.SimpleFactory;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        return (getdNumberB()==0)?0:getdNumberA() / getdNumberB();
    }
}
