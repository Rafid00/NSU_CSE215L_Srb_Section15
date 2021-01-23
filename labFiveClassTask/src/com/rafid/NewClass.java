package com.rafid;

import java.util.Scanner;

public class NewClass {

    public static String[][] stirngarrayExample(int m, int n) {
        String[][] arr = new String[m][n];
        Scanner sc = new Scanner(System.in);
        System.out.println("give some integer inputs for arraysize " + n + " " + m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; i < n; j++) {

                arr[i][j] = sc.nextLine();
            }
        }
        System.out.println("you have given these input");
        for (int i = 0; i < m; i++) {
            for (int j = 0; i < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    public static double doubleExample(int m, int n) {
        if (n != 0) {
            return m / n;
        } else {
            return m;
        }

    }

    public static void main(String[] args) {

        //arrayExample(2, 2, 2);
        System.out.println(doubleExample(22, 0));
    }
}
