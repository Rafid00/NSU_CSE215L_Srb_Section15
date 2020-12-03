package com.company;

public class Main {
    public static void main(String[] args) {
        Menu men = new Menu();        //creating a object of menu class
        int a = men.showMenu();       //returning the exact value user passed in the object
        men.handleMenuInput(a);       //passing the value to the method handleMenuInput in the same object
    }
}
