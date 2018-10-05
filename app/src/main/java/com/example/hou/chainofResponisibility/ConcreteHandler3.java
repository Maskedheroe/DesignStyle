package com.example.hou.chainofResponisibility;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request>=20 && request<30){
            System.out.println("处理请求"+ request);
        }else if (success!=null){
            success.handleRequest(request);  //转移到下一位
        }
    }
}
