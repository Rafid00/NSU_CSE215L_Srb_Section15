package com.company;

public class Calculator {

    public double add(double a, double b){
        return a+b; //returning after adding a & b
    }
    public double subtract(double a, double b){
        return a-b; //returning after subtracting a & b
    }
    public double multiply(double a, double b){
        return a*b; //returning after multiplying a & b
    }
    public double divide(double a, double b){
        if(b!=0){
            return a/b; //if the denominator isn't 0, to be exact, if it's valid then returning after diving between a & b
        }
        else{
            System.out.println("division by zero");
            return -1.0; //if the denominator is zero it will throw an error (-1)
        }
    }
}
