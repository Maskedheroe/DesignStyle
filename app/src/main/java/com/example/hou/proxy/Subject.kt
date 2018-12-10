package com.example.hou.proxy

import android.util.Log

abstract class Subject {   //定义了RealSubject和Proxy 的共用接口 这样就在任何使用RealSubject的地方使用Proxy
    public abstract fun Request()
}
class RealSubject : Subject() {      //定义Proxy所代表的真实实体

    override fun Request() {

        Log.d("Proxy","真实的请求")
    }

}

class Proxy : Subject(){   //保存一个引用使得代理可以访问实体 并提供一个与Subject的接口相同的接口  这样代理就可以用来代替实体

    private var realSubject : RealSubject? = null

    override fun Request() {
        if (realSubject == null){
            realSubject = RealSubject()
        }
        realSubject?.Request()
    }

}

fun main(args: Array<String>) {
    val proxy = Proxy()
    proxy.Request()


}