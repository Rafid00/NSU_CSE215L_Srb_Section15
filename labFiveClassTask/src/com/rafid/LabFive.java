package com.rafid;

import java.util.Scanner;

public class LabFive {

    public static void arrayExample(int n) {
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("give some integer inputs for arraysize " + n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("you have given these input");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }

    }

    public static void arrayExample(int m, int n) {
        int[][] arr = new int[m][n];
        Scanner sc = new Scanner(System.in);
        System.out.println("give some integer inputs for arraysize " + n + " " + m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; i < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("you have given these input");
        for (int i = 0; i < m; i++) {
            for (int j = 0; i < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void arrayExample(int m, int n, int o) {
        int[][][] arr = new int[m][n][o];
        Scanner sc = new Scanner(System.in);
        System.out.println("give some integer inputs for arraysize " + n + " " + m + " " + o);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    System.out.println("given input for " + i + " " + j + " " + k);

                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("you have given these input");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {

                    System.out.print(arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println(i+"th channel");
        }
    }

    public static void main(String[] args) {

        arrayExample(2, 2, 2);

    }
}
