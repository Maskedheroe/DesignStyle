package com.example.hou.prototype;


/*
* 原型模式要注意深copy
* 引用类型的对象只会复制引用 所以无论拷贝多少份对象 最后只会指向最后一份的对象
* */


public class ConcretePrototype1 extends ProtoType {

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public ProtoType Clone() {
//        return this.Clone();   //此处只是演示要实现抽象方法 仅此而已
        return null;
    }
}
