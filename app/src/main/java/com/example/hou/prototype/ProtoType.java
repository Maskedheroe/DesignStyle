package com.example.hou.prototype;

public abstract class ProtoType {



    private String id;

    public ProtoType(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract ProtoType Clone();  //抽象类关键要有这一个Clone方法
}
