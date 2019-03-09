package com.example.hou.adapter

abstract class Target{

    abstract fun request()

}

class Adaptee{

    public fun specificRequest(){
        println("特殊请求!")
    }

}

class Adapter : Target(){

    private val adaptee = Adaptee()  //此处实例化的 Adaptee的私有对象

    override fun request() {
        adaptee.specificRequest()
    }

}

class Test {

    val target = Adapter()

    fun test(){
        target.request()  //虽然调用的是Adapter的request 但其实是的用的 Adaptee的请求
    }

}