package com.anglia0222.builder;

public abstract class Builder {

    private Product product;

    public abstract void buildWall();

    public abstract  void buildRoof();

    public Product createProduct(){
        return product;
    }

}
