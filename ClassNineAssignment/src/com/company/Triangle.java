package com.company;

import java.util.Scanner;

public class Triangle {
    //declaring some private variables
    private double base;
    private double height;

    //constructor if no value is passed by user, more like default values
    public Triangle() {
        this(4, 3);
    }

    //constructor if the values are passed by user
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() { //will return the base
        return base;
    }

    public void setBase(double base) { //will set the value as the parameter in variable "base"
        this.base = base;
    }

    public double getHeight() { //will return the height
        return height;
    }

    public void setHeight(double height) { //will set the value as the parameter in variable "height"
        this.height = height;
    }

    public double triPerimeter(Triangle obj) { //will return the perimeter value of the triangle of passed triangle object
        return (3 * obj.base);
    }


    public double triArea(Triangle obj) { //will return the area value of the triangle of passed triangle object
        return ((obj.height * obj.base) / 2);
    }

    public void drawTriangle() {
        Scanner input = new Scanner(System.in);
        char x = '*'; //the character user want to draw for the edges of the triangle
        System.out.println("what will be the drawing type? (Options: hollow/fill)");
        String drawing_type = input.nextLine(); //drawing type, can be hollow or fill
        int x_count = 1;

        if (drawing_type.equals("hollow")) { //if user want to draw the pattern of the triangle as hollow type
            for (int i = 1; i <= (int) (this.base / 2) + 1; i++) { //defining the row count
                for (int j = (int) (base / 2); j >= i; j--) { //printing space
                    System.out.print("  ");
                }
                if (i != (int) (this.base / 2) + 1) { // if not the last line of the row
                    for (int k = 1; k <= x_count; k++) { //if first element then it will print otherwise it will print space as it's hollow
                        if (k == 1 || k == x_count) {
                            System.out.print(x + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                } else {
                    for (int k = 1; k <= x_count; k++) {
                        System.out.print(x + " ");
                    }
                }
                System.out.println();
                x_count += 2;

            }
        }

        if (drawing_type.equals("fill")) {
            for (int i = 1; i <= (int) (this.base / 2) + 1; i++) { //defining the row count
                for (int j = (int) (base / 2); j >= i; j--) { //printing space
                    System.out.print("  ");
                }
                for (int k = 1; k <= x_count; k++) {
                    System.out.print(x + " ");
                }
                System.out.println();
                x_count += 2;
            }
        }
    }


    //different solution I made if base is even number


//        public void drawTriangle() {
//        char x = '*';
//        String drawing_type = "hollow";
//
//        if (this.base % 2 != 0) {
//            int x_count = 1;
//
//            if (drawing_type.equals("hollow")) {
//                for (int i = 1; i <= (int) (this.base / 2) + 1; i++) {
//                    for (int j = (int) (base / 2); j >= i; j--) {
//                        System.out.print("  ");
//                    }
//                    if (i != (int) (this.base / 2) + 1) {
//                        for (int k = 1; k <= x_count; k++) {
//                            if (k == 1 || k == x_count) {
//                                System.out.print(x + " ");
//                            } else {
//                                System.out.print("  ");
//                            }
//
//                        }
//                    } else {
//                        for (int k = 1; k <= x_count; k++) {
//                            System.out.print(x + " ");
//                        }
//                    }
//                    System.out.println();
//                    x_count += 2;
//
//                }
//            }
//
//            if (drawing_type.equals("fill")) {
//                for (int i = 1; i <= (int) (this.base / 2) + 1; i++) {
//                    for (int j = (int) (base / 2); j >= i; j--) {
//                        System.out.print("  ");
//                    }
//                    for (int k = 1; k <= x_count; k++) {
//                        System.out.print(x + " ");
//                    }
//                    System.out.println();
//                    x_count += 2;
//                }
//            }
//        } else {
//            int x_count = 2;
//
//            if (drawing_type.equals("hollow")) {
//                for (int i = 1; i <= (int) (this.base / 2); i++) {
//                    for (int j = (int) (base / 2); j >= i; j--) {
//                        System.out.print("  ");
//                    }
//                    if (i != (int) (this.base / 2)) {
//                        for (int k = 1; k <= x_count; k++) {
//                            if (k == 1 || k == x_count) {
//                                System.out.print(x + " ");
//                            } else {
//                                System.out.print("  ");
//                            }
//
//                        }
//                    } else {
//                        for (int k = 1; k <= x_count; k++) {
//                            System.out.print(x + " ");
//                        }
//                    }
//                    System.out.println();
//                    x_count += 2;
//
//                }
//            }
//
//            if (drawing_type.equals("fill")) {
//                for (int i = 1; i <= (int) (this.base / 2); i++) {
//                    for (int j = (int) (base / 2); j >= i; j--) {
//                        System.out.print("  ");
//                    }
//                    for (int k = 1; k <= x_count; k++) {
//                        System.out.print(x + " ");
//                    }
//                    System.out.println();
//                    x_count += 2;
//                }
//            }
//
//
//        }


}





