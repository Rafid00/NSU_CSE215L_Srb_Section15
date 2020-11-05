import java.util.Scanner;

public class LabOneTask_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();


        if (number % 2 == 0)
            System.out.println("it's an Even Number");
        else
            System.out.println("it's an Odd Number");
    }
}
