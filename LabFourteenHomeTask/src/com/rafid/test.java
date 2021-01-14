package com.rafid;

public class test implements CompareAreaInterface<GeometricObject> {
    @Override
    public void compareArea(GeometricObject triangle, GeometricObject rectangle) {
        if(triangle.getArea()>rectangle.getArea()){
            System.out.println("triangle is larger than the rectangle");
        }else if(triangle.getArea()<rectangle.getArea()){
            System.out.println("rectangle is larger than the triangle");
        }else {
            System.out.println("both equal");
        }
    }
}