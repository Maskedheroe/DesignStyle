package com.example.hou.chainofResponisibility;

public abstract class Handler {
    protected Handler success;

    public void setSuccessor(Handler successor){
        this.success = successor;
    }

    public abstract void handleRequest(int request);  //处理请求的抽象方法
}
