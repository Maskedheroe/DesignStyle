package com.example.hou.observable

import java.util.*

class Coder(var aName : String) : Observer {

    val name: String = aName

    override fun update(o: Observable?, arg: Any?) {
        println("Hi,$name, DevTechFrontier更新啦,内容:$arg")
    }

    override fun toString(): String {
        return "码农 : $name"
    }

}

class DevTechFrontier : Observable() {

    public fun postNewPublication(content:String){
        //标识状态或者内容发生改变
        setChanged()
        //通知所有观察者
        notifyObservers(content)
    }

}

class Test{

    public fun test(){
        //被观察的角色
        val DevTechFrontier = DevTechFrontier()

        //观察者
        val mrsimple = Coder("mr.simple")
        val coder1 = Coder("coder-1")
        val coder2 = Coder("coder-2")
        val coder3 = Coder("coder-3")

        //将观察者注册到可观察对象的观察者列表中
        DevTechFrontier.addObserver(mrsimple)
        DevTechFrontier.addObserver(coder1)
        DevTechFrontier.addObserver(coder2)
        DevTechFrontier.addObserver(coder3)

        DevTechFrontier.postNewPublication("新的一期开发技术前线周报发布啦!")

    }


}