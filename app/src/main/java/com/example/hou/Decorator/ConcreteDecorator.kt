package com.example.hou.Decorator

class ConcreteDecoratorA : Decorator() {

    private var addedState: String? = null  //本类的独有功能 区别B

    override fun Operation() {
        super.Operation()
        addedState = "New State"
        println("具体装饰对象 A 的操作")
    }

}

class  ConcreteDecoratorB : Decorator(){
    override fun Operation() {
        super.Operation()
        /**
         * 首先执行原Component的Operation 再执行本类的功能  相当于对原Component进行了装饰
         * */
        AddBehavior()
        println("具体装饰对象 B 的操作")

    }

    private fun AddBehavior() {
        /*本类独有的方法 区别于A类*/
    }
}