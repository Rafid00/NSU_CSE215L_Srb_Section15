package com.company;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction() {
        this(1, 1);
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return (this.numerator + "/" + this.denominator);
    }

    public void add(Fraction obj) {
        try {
            float result = ((float) this.numerator / (float) this.denominator) + ((float) obj.numerator / (float) obj.denominator);
            System.out.println("add result: " + result);

        } catch (Exception e) {
            System.out.println("wrong input");
        }
    }

    public void sub(Fraction obj) {
        try {
            float result = ((float) this.numerator / (float) this.denominator) - ((float) obj.numerator / (float) obj.denominator);
            System.out.println("subtract result: " + result);
        } catch (Exception e) {
            System.out.println("wrong input");
        }

    }

    public void multiplication(Fraction obj) {
        try {
            float result = ((float) this.numerator / (float) this.denominator) * ((float) obj.numerator / (float) obj.denominator);
            System.out.println("multiplication result: " + result);
        } catch (Exception e) {
            System.out.println("wrong input");
        }

    }

    public void division(Fraction obj) {
        try {
            float result = ((float) this.numerator / (float) this.denominator) / ((float) obj.numerator / (float) obj.denominator);
            System.out.println("division result: " + result);
        } catch (Exception e) {
            System.out.println("wrong input");
        }

    }


}
