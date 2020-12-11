package com.company;

import java.util.Scanner;

public class Circle {
    //declaring some private variables
    private double radius;

    public Circle() {  //constructor if no value is passed by user, more like default values
        this(5);
    }

    public Circle(double radius) {  //constructor if the values are passed by user
        this.radius = radius;
    }

    public double getRadius() {  //will return the radius
        return radius;
    }

    public void setRadius(double radius) {  //will set the value as the parameter in variable "radius"
        this.radius = radius;
    }

    public double circCircumference(Circle obj) {  //will return the circumference value of the circle of passed circle object
        return (2 * 3.1416 * obj.radius);
    }

    public double circArea(Circle obj) {  //will return the area value of the circle of passed circle object
        return (3.1416 * Math.pow(radius, 2));
    }

    public void drawCircle() {  //will draw the circle according to the radius
        //the whole thing is done base on Circle Equation
        //the result will be changed based on the Radius input
        double width, space;

        //this loop is to make the first half of the circle
        for (double i = this.radius - 1; i > 0; i-=1.25) { //1.25 decrement was on basis of making the circle more perfect to look
            width = Math.round(Math.sqrt(Math.pow(this.radius, 2) - Math.pow(i, 2))) * 2; //finding "x" value from the Circle equation
            space = Math.round((((this.radius * 4) - 1) - ((width * 2) - 1)) / 2); //equation for Space to make the circle perfectly, and x2 to make it equvalent to " " (spaces that were printed)
            for (int k = 0; k < space; k++) {
                System.out.print(" "); //printing the spaces
            }

            for (int j = 0; j < width; j++) {
                System.out.print("* "); //printing the stars to fill the circle
            }
            System.out.println();
        }

        //this loop is to make the second half of the circle
        //same explaination as the first half
        for (double i = 1; i < this.radius; i+=1.25) {
            width = Math.round(Math.sqrt(Math.pow(this.radius, 2) - Math.pow(i, 2))) * 2;
            space = Math.round((((this.radius * 4) - 1) - ((width * 2) - 1)) / 2);
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

