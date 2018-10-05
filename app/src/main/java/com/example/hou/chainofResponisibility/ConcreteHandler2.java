package com.example.hou.chainofResponisibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request>=10 && request<20){
            System.out.println("处理请求"+ request);
        }else if (success!=null){
            success.handleRequest(request);  //转移到下一位
        }
    }
}
