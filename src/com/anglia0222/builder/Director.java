package com.anglia0222.builder;

public class Director {
    public Builder builer;

    public Director(Builder builer) {
        this.builer = builer;
    }

    public Product directProduct(){
        builer.buildWall();
        builer.buildRoof();

        return builer.createProduct();
    }
}
