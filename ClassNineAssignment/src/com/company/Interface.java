package com.company;

import java.awt.*;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {

        //calling objects of different user-defined classes
        User user = new User();
        Rectangle rectangle = new Rectangle(10, 7);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(9, 5);

        Scanner input = new Scanner(System.in);

        //making the program interactive to the users by adding options
        //users can add their inputs and get their desired output
        //if user don't input anything, by default some values which were passed by constructor will be on action
        int choose;
        do {
            System.out.println("Main Menu - press the option serial - Warning: The Pattern or Drawings will be drawn based on the Input or Set values" +
                    "\n1.Set User\n2.View User\n3.Set Rectangle\n4.View Rectangle\n5.Set Triangle\n6.View Triangle\n7.Set Circle\n8.View Circle\n9.Exit");
            System.out.println();
            choose = input.nextInt();
            input.nextLine();
            System.out.println();

            if (choose == 1) {
                System.out.println("enter user name here");
                user.setName(input.nextLine());
                System.out.println("enter user id here");
                user.setId(input.nextInt());
                input.nextLine();
                System.out.println("enter user email here");
                user.setEmail(input.nextLine());
            } else if (choose == 2) {
                System.out.println("user name: " + user.getName() + "\nuser id: " + user.getId() + "\nuser email: " + user.getEmail());
            } else if (choose == 3) {
                System.out.println("input the length of the Rectangle");
                rectangle.setLength(input.nextDouble());
                System.out.println("input the width of the Rectangle");
                rectangle.setWidth(input.nextDouble());
            } else if (choose == 4) {
                System.out.println("width: " + rectangle.getWidth() + "\nlength: " + rectangle.getLength() + "\nPerimeter of the Rectangle: " + rectangle.recPerimeter(rectangle)
                        + "\nArea of the Rectangle: " + rectangle.recArea(rectangle));
                System.out.println();
                rectangle.drawRectangle();
            } else if (choose == 5) {
                System.out.println("input the base of the Triangle");
                triangle.setBase(input.nextDouble());
                System.out.println("input the height of the Triangle");
                triangle.setHeight(input.nextDouble());
            } else if (choose == 6) {
                System.out.println("base: " + triangle.getBase() + "\nheight: " + triangle.getHeight() + "\nPerimeter of the Triangle: " + triangle.triPerimeter(triangle)
                        + "\nArea of the Triangle: " + triangle.triArea(triangle));
                System.out.println();
                triangle.drawTriangle();
            } else if (choose == 7) {
                System.out.println("input the radius of the Circle");
                circle.setRadius(input.nextDouble());
            } else if (choose == 8) {
                System.out.println("radius " + circle.getRadius() + "\nCircumference of the Triangle: " + circle.circCircumference(circle)
                        + "\nArea of the Circle: " + circle.circArea(circle));
                System.out.print("-> press enter to draw the circle...");
                input.nextLine();
                circle.drawCircle();
            }


            System.out.println();
        } while (choose != 9); //it will stop if the user's input is 9 aka Exit

    }

}