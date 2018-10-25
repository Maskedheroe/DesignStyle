package com.example.hou.strategy;

public class Test {

    public static void main(){
        Context context;
        context = new Context(new ConCreteStrategyA());  //由于实例化不同的策略 所以最终调用context.ContextInterfacer就不同
        context.contextInterface();

        context = new Context(new ConCreteStrategyB());
        context.contextInterface();

        context = new Context(new ConCreteStrategyC());
        context.contextInterface();
    }

}
