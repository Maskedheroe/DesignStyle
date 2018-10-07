package com.example.hou.bulider;

import java.util.ArrayList;
import java.util.List;

public class Product {
    //产品类 由多个部件组成
    private List<String> parts = new ArrayList<>(20);

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("创建！");
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
