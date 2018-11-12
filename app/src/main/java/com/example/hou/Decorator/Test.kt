package com.example.hou.Decorator

fun main(args:String){

    val c:ConcreteComponent = ConcreteComponent()
    val d1 : ConcreteDecoratorA = ConcreteDecoratorA()
    val d2 : ConcreteDecoratorB = ConcreteDecoratorB()

    d1.setComponent(c)  //d1包装c
    d2.setComponent(d1) //d2包装d1
    d2.Operation()      //最终执行Operation()


}