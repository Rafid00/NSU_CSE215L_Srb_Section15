package com.rafid;

import java.util.Scanner;

public class ElectronicDevice extends Product {
    public String model;
    public String warranty;

    public ElectronicDevice(String name, Double price, String model, String warranty) {
        super(name, price);
        this.model = model;
        this.warranty = warranty;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public void changePrice(double percentage) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Press T to add tax, or Press D to add discount");
//        String option = in.nextLine();
        String option = "T";
        if (option.equals("T") || option.equals("t")) {
            setPrice((getPrice() + (percentage * getPrice()) / 100));
        } else if (option.equals("D") || option.equals("d")) {
            setPrice((getPrice() - (percentage * getPrice()) / 100));
        }
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "model='" + model + '\'' +
                ", warranty='" + warranty + '\'' +
                '}';
    }
}
