package com.rafid;

public class Main {
    public static void main(String[] args) {
        Triangle tri = new Triangle(7, 6, 5);
        Rectangle rec = new Rectangle(4, 3);
        tri.setArea();
        rec.setArea();
        test test = new test();
        test.compareArea(tri, rec);
    }
}
