package com.example.hou.strategy;



/**
 *
 * context 用一个ConcreteStrategy来配置
 * 维护一个对Strategy的引用
 *
 * */
public class Context {

    IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){  //根据具体的策略对象 调用具体的算法
        if (strategy!=null){
            strategy.AlgorithmInterface();
        }
    }
}
