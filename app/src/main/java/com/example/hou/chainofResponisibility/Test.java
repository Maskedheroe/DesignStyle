package com.example.hou.chainofResponisibility;
/*
*
* 职责链的好处就是请求者不用管哪个对象来处理， 总归有人处理！
*
*
*
* */
public class Test {
    private static void show(){
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);  //设置职责链的上家与下家
        h2.setSuccessor(h3);

        int [] requests = {2,5,13,15,17,19,26,30};
        for (int request : requests) {
            h1.handleRequest(request);  //循环遍历消息集合 并派给最小处理者处理
        }
    }
}
