package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangle tri = new Triangle();
        Rectangle rec = new Rectangle();

        System.out.println("Main Menu - Select The Serial Of The Option");
        System.out.println("1. Triangle\n2. Rectangle");
        int option = in.nextInt();
        if (option == 1) {
            System.out.println("input the value of side 1 of the triangle");
            tri.setSide1(in.nextDouble());
            System.out.println("input the value of side 2 of the triangle");
            tri.setSide2(in.nextDouble());
            System.out.println("input the value of side 3 of the triangle");
            tri.setSide3(in.nextDouble());
            in.nextLine();
            System.out.println("what color the triangle is?");
            tri.setColor(in.nextLine());
            System.out.println("is the triangle filled? (true/false)");
            tri.setFilled(in.nextBoolean());
            System.out.println();
            System.out.println("area: " + tri.getArea() + "\nperimeter: " + tri.getPerimeter() + "\ncolor: " + tri.getColor() + "\nis filled: " + tri.getFilled());
            System.out.println("this one is from displayObject method -> ");
            System.out.println(tri.displayObject(tri));
        } else if (option == 2) {
            System.out.println("input the value of side 1 of the rectangle");
            rec.setSide1(in.nextDouble());
            System.out.println("input the value of side 2 of the rectangle");
            rec.setSide2(in.nextDouble());
            in.nextLine();
            System.out.println("what color the rectangle is?");
            rec.setColor(in.nextLine());
            System.out.println("is the rectangle filled? (true/false)");
            rec.setFilled(in.nextBoolean());
            System.out.println();
            System.out.println("area: " + rec.getArea() + "\nperimeter: " + rec.getPerimeter() + "\ncolor: " + rec.getColor() + "\nis filled: " + rec.getFilled());
            System.out.println("this one is from displayObject method -> ");
            System.out.println(rec.displayObject(rec));
        } else {
            System.out.println("Invalid input. Input 1 or 2");
        }
    }
}
