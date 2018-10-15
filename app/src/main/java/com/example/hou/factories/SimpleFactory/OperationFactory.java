package com.example.hou.factories.SimpleFactory;

public class OperationFactory {
    //静态工厂的静态方法
    public static Operation createFactory(String operate){
        Operation oper = null;
        switch (operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }

}
