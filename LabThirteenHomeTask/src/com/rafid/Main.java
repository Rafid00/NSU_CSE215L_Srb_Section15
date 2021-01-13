package com.rafid;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product p1 = new ElectronicDevice("iPad", 67000.0, "Air", "1 Year");
        ClothingItem p2 = new ClothingItem("Jeans", 2000.0, "Denim");
        ElectronicDevice p3 = new ElectronicDevice("iPhone", 87000.0, "11", "1 Year");
        p3.changePrice(10);
        p2.changePrice(20);

        System.out.println(p3.getPrice());
        System.out.println(p2.getPrice());

        ArrayList<Product> product= new ArrayList<Product>();
        product.add(p1);
        product.add(p2);
        product.add(p3);
        for(int i=0; i<product.size();i++){
            System.out.println(product.get(i));
        }
    }
}
