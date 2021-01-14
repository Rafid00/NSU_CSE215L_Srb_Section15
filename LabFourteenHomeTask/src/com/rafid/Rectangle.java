package com.rafid;

public class Rectangle extends GeometricObject {
    private double side1;
    private double side2;


    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void setArea() {
        double area = side1 * side2;
        super.setArea(area);
    }
}
