package com.anglia0222.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new HightBuilding();

        Director director = new Director(builder);
        director.directProduct();


    }
}
