package com.company;

public class Triangle extends GeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
        this("Black", true, 1, 1, 1);
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (side1 + side2 > side3) {
            this.side3 = side3;
        } else {
            System.out.println("invalid triangle, triangle must is a+b>c");
        }
    }

    public double getArea() { //using heron's formula of finding area of a triangle by 3 sides given
        return (0.25 * Math.sqrt((side1 + side2 + side3) * (-side1 + side2 + side3) * (side1 - side2 + side3) * (side1 + side2 - side3)));
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public String displayObject(Triangle object) {
        return ("area: " + object.getArea() + "\nperimeter: " + object.getPerimeter() + "\n" + object.toString());
    }
}
