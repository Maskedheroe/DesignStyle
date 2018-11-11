package com.example.hou.iterator;

public  abstract class Iterator  {

    /**
     *
     * 用于定义得到开始对象、得到下一个对象、
     * 判断是否到结尾、当前对象等抽象方法
     * 统一接口
     * */

    public abstract Object First();
    public abstract Object Next();
    public abstract boolean IsDone();
    public abstract Object CurrentItem();
}
