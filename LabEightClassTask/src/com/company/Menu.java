package com.company;

import java.util.Scanner;

public class Menu {
    Scanner userInput = new Scanner(System.in);
    Calculator calc = new Calculator();


    public int showMenu() {
        //showing the menu
        System.out.println("press 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division");
        System.out.println("choose your option");
        int a = userInput.nextInt();
        //returning the same exact value user passed to this method
        if (a == 1) {
            return 1;
        } else if (a == 2) {
            return 2;
        } else if (a == 3) {
            return 3;
        } else if (a == 4) {
            return 4;
        } else {
            return -1;     //throwing a error, coz its out of our menu
        }
    }

    public void handleMenuInput(int menuInput) {
        if (menuInput >= 1 && menuInput <= 4) {    //justifying if the input by user is correct
            System.out.println("give first input ");
            double m = userInput.nextDouble();
            System.out.println("give second input ");
            double n = userInput.nextDouble();
            if (menuInput == 1) {
                System.out.println("result " + calc.add(m, n)); //calling add method in Calculator class, passing parameters which user did input
            } else if (menuInput == 2) {
                System.out.println("result " + calc.subtract(m, n)); //calling subtract method in Calculator class, passing parameters which user did input
            } else if (menuInput == 3) {
                System.out.println("result " + calc.multiply(m, n)); //calling multiply method in Calculator class, passing parameters which user did input
            } else if (menuInput == 4) {
                System.out.println("result " + calc.divide(m, n)); //calling divide method in Calculator class, passing parameters which user did input
            }
        } else { //if the menu input is invalid
            System.out.println("invalid input");
        }
    }
}