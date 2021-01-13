package com.rafid;

import java.util.Scanner;

public class ClothingItem extends Product {
    private String fabricType;

    public ClothingItem(String name, Double price, String fabricType) {
        super(name, price);
        this.fabricType = fabricType;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    @Override
    public void changePrice(double percentage) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Press T to add tax, or Press D to add discount");
//        String option = in.nextLine();
        String option = "D";
        if (option.equals("T") || option.equals("t")) {
            setPrice((getPrice() + (percentage * getPrice()) / 100));
        } else if (option.equals("D") || option.equals("d")) {
            setPrice((getPrice() - (percentage * getPrice()) / 100));
        }
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "fabricType='" + fabricType + '\'' +
                '}';
    }
}
