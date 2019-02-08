package com.example.hou.builder;

public class ConcreteBuilder2 extends Bulider {

    private Product product = new Product();

    @Override
    public Bulider buildePartA() {
        product.add("部件X");
        return this;
    }

    @Override
    public Bulider buildePartB() {
        product.add("部件Y");
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
