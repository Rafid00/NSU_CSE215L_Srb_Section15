package com.company;

public class Main {
    public static void main(String[] args) {
        Fraction obj1 = new Fraction();
        Fraction obj2 = new Fraction();

        obj1.setNumerator(21);
        obj1.setDenominator(17);

        obj2.setNumerator(131);
        obj2.setDenominator(237);

        String str1 = obj1.toString();
        String str2 = obj2.toString();

        System.out.println("first obj: " + str1);
        System.out.println("second obj: " + str2);

        obj1.add(obj2);
        obj1.sub(obj2);
        obj1.multiplication(obj2);
        obj1.division(obj2);

    }

}
