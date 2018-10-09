package com.example.hou.TemplateMethord;

public abstract class TestPaper {

    public void TestQuestion1(){
        System.out.println("杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是[]a.球墨铸铁 b. 马口铁 c.高速合金钢 d.碳素纤维");

        System.out.println("答案" + answer());   //此处就成为了子类的模板 所以就是极少的代码留给了子类去实现  不让每个子类去重复
    }

    abstract String answer();
}
