package com.company;

import java.util.Scanner;

public class Rectangle {
    //declaring some private variables
    private double length;
    private double width;

    public Rectangle() {  //constructor if no value is passed by user, more like default values
        this(2, 2);
    }

    public Rectangle(double length, double width) { //constructor if the values are passed by user
        this.length = length;
        this.width = width;
    }

    public double getLength() { //will return the length
        return length;
    }

    public void setLength(double length) { //will set the value as the parameter in variable "length"
        this.length = length;
    }

    public double getWidth() { //will return the width
        return width;
    }

    public void setWidth(double width) { //will set the value as the parameter in variable "length"
        this.width = width;
    }

    public double recPerimeter(Rectangle obj) { //will return the perimeter value of the rectangle of passed rectangle object
        return (2 * (obj.length + obj.width));
    }

    public double recArea(Rectangle obj) { //will return the area value of the rectangle of passed rectangle object
        return (obj.length * obj.width);
    }

    public void drawRectangle() {
        Scanner input = new Scanner(System.in);
        char x = '*'; //the character user want to draw for the edges of the rectangle
        System.out.println("what will be the drawing type? (Options: hollow/fill)");
        String drawing_type = input.nextLine(); //drawing type, can be hollow or fill
        if (drawing_type.equals("hollow")) { //if user want to draw the pattern of the rectangle as hollow type
            for (int i = 1; i <= this.width; i++) { //drawing the row according to the width that user passed
                for (int j = 1; j <= this.length; j++) { //drawing the column according to the length that user passed
                    if (i == 1 || i == this.width) { // for 1st and last line of the row will print the whole line
                        System.out.print(x + " ");
                    } else {
                        if (j == 1 || j == this.length) { // to make hollow, have to print the borders only
                            System.out.print(x + " ");
                        } else { //will be blank or space to make it hollow
                            System.out.print("  ");
                        }
                    }
                }
                System.out.print("\n");
            }
        }

        if (drawing_type.equals("fill")) { //if user want to draw the pattern of the triangle as fill type
            for (int i = 1; i <= this.width; i++) { //simply gonna print the rows
                for (int j = 1; j <= this.length; j++) { // will print the whole line
                    System.out.print(x + " ");
                }
                System.out.print("\n");
            }
        }

    }

}

