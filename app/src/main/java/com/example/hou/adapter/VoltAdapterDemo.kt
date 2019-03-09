package com.example.hou.adapter

/**
 * Target角色
 * */
interface FiveVolt {
    public fun getVolt5(): Int
}


/**
 *
 * Adaptee角色 需要被转换的对象
 *
 * */

public class Volt220 {

    public fun getVolt220(): Int {
        return 220
    }

}


/**
 * 对象适配器
 * */
public class VoltAdapter(adapter: Volt220) : FiveVolt {

    val mVolt220: Volt220 = adapter


    override fun getVolt5(): Int {
        return 5
    }

    fun getVolt220(): Int =
            mVolt220.getVolt220()

}


public class TestDemo1 {

    val adapter : VoltAdapter = VoltAdapter(Volt220())

    fun show(){
        adapter.getVolt5()
        println("拿到了5伏！")
    }
}
