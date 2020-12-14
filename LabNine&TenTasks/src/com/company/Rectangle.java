package com.company;

public class Rectangle extends GeometricObject {
    private double side1 = 1;
    private double side2 = 1;

    public Rectangle() {
        this("Yellow", false, 2, 4);
    }

    public Rectangle(String color, boolean filled, double side1, double side2) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getArea() {
        return (side1 * side2);
    }

    public double getPerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    public String displayObject(Rectangle object) {
        return ("area: " + object.getArea() + "\nperimeter: " + object.getPerimeter() + "\n" + object.toString());
    }
}
