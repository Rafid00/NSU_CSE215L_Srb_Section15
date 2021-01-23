package com.rafid;

public class Main {


    public static void main(String args[]) {

        Circle circ = new Circle("Black", false, 5.25);

        System.out.println(circ.getArea());

        System.out.println(circ.toString());

        circ.setColor("purple");

        System.out.println(circ.getColor());

        GeometricObject geo = new GeometricObject();

        System.out.println(geo.toString());
    }
}
