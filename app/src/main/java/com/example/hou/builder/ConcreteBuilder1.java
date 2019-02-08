package com.example.hou.builder;

public class ConcreteBuilder1 extends Bulider {

    private Product product = new Product();

    @Override
    public Bulider buildePartA() {
        product.add("部件A");
        return this;
    }

    @Override
    public Bulider buildePartB() {
        product.add("部件B");
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
