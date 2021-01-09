package com.rafid;

import self.created.exceptions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FarmerRegSys farmer = new FarmerRegSys();
        int option;

        do {
            System.out.println("Pick An Option\n1. Fill Up The Form Of Farmer Registration System\n2. Show The Filled Form To The User\n3. Quit");
            option = in.nextInt();
            in.nextLine();
            //taking all the necessary inputs from the user
            if (option == 1) {
                System.out.println("Enter First Name:");
                try {
                    farmer.setFirstName(in.nextLine());
                } catch (NumericNotAllowedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Last Name:");
                try {
                    farmer.setLastName(in.nextLine());
                } catch (NumericNotAllowedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Date of Birth:");
                String arr[] = new String[3];
                System.out.println("Day: ");
                arr[0] = in.nextLine();
                System.out.println("Month: ");
                arr[1] = in.nextLine();
                System.out.println("Year: ");
                arr[2] = in.nextLine();
                try {
                    farmer.setDateOfBirth(arr);
                } catch (OverEighteenException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Number of Family Members above age 18:");
                try {
                    farmer.setAboveAge18(in.nextLine());
                } catch (FamilyMembersOverloadException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Number of Family Members below age 18:");
                try {
                    farmer.setBelowAge18(in.nextLine());
                } catch (FamilyMembersOverloadException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Average Monthly Personal Income:");
                try {
                    farmer.setAvgPerIncome(in.nextLine());
                } catch (DigitOverloadedException e) {
                    System.out.println(e.getMessage());
                } catch (NonNumericNotAllowedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Average Monthly Family Income by:");
                try {
                    farmer.setAvgFamilyIncome(in.nextLine());
                } catch (DigitOverloadedException e) {
                    System.out.println(e.getMessage());
                } catch (NonNumericNotAllowedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Average Monthly Family Expense:");
                try {
                    farmer.setAvgFamilyExpense(in.nextLine());
                } catch (DigitOverloadedException e) {
                    System.out.println(e.getMessage());
                } catch (NonNumericNotAllowedException e) {
                    System.out.println(e.getMessage());
                } catch (ExpenseLimitException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Average Monthly Farming Expense:");
                try {
                    farmer.setAvgFarmingExpense(in.nextLine());
                } catch (DigitOverloadedException e) {
                    System.out.println(e.getMessage());
                } catch (NonNumericNotAllowedException e) {
                    System.out.println(e.getMessage());
                } catch (ExpenseLimitException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter If they need any help from the government(true/false):");
                try {
                    farmer.setIfNeedHelp(in.nextLine());
                } catch (BooleanNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Amount of money they wish to have as stipend from the Govt.:");
                try {
                    farmer.setWishStipendAmount(in.nextLine());
                } catch (NonNumericNotAllowedException e) {
                    System.out.println(e.getMessage());
                } catch (ExpenseLimitException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Fertilizers (in Kg) s/he needs to buy each month:");
                try {
                    farmer.setFertilizerNeeds(in.nextLine());
                } catch (DigitOverloadedException e) {
                    System.out.println(e.getMessage());
                } catch (NonNumericNotAllowedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println();
                System.out.println("Input Taken Successfully");
                System.out.println();
            }

            //printing all the assigned values of the object
            else if(option==2){
                System.out.println();
                System.out.println(farmer.toString());
                System.out.println();
            }
        } while (option != 3); //will quit

    }

}
