package com.rafid;

public class Circle extends GeometricObject {

    private double radius;

    public Circle(String color, boolean filled, double radius) {

        super(color, filled);

        this.radius = radius;
    }

    public double getArea() {

        return 3.1416 * radius * radius;
    }

    public double getPerimeter() {

        return 2 * 3.1416 * radius;
    }

    public String toString() {

        return super.toString() + " radius: " + radius;
    }
}
